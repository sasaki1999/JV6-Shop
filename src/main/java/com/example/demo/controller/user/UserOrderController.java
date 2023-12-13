// package com.example.demo.controller.user;

// import java.math.BigDecimal;
// import java.util.LinkedHashMap;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;

// import com.example.demo.entity.AccountEntity;
// import com.example.demo.entity.CartEntity;
// import com.example.demo.entity.OrderDetailEntity;
// import com.example.demo.entity.OrderEntity;
// import com.example.demo.entity.ProductEntity;
// import com.example.demo.service.user.CartService;
// import com.example.demo.service.user.OrderService;
// import com.example.demo.service.user.ProductService;

// import jakarta.servlet.http.HttpSession;

// public class UserOrderController {
//     @Autowired
//     OrderService orderService;

//     @Autowired
//     CartService cartService;

//     @Autowired
//     OrderItemService orderItemService;

//     @Autowired
//     ProductService productService;

//     // @Autowired
//     // SaleOffService saleOffService;

//     // @Autowired
//     // NotificationService notificationService;

//     @Autowired
//     EmailService emailService;

//     @Autowired
//     HttpSession session;

//     @GetMapping("order/history-payment/{userId}")
//     private List<OrderEntity> findAllByUserId(@PathVariable int userId) {
//         return orderService.findByUserId(userId);
//     }

//     @GetMapping("order/findById/{orderId}")
//     private ResponseEntity<OrderEntity> findByOrderId(@PathVariable String orderId) {
//         OrderEntity order = orderService.findByOrderId(orderId);
//         return ResponseEntity.ok().body(order);
//     }

//     @PostMapping("order/cancel-order")
//     private void cancelOrder(@RequestBody CancelOrderDto cancelOrderDto) {
//         AccountEntity users = (AccountEntity) session.getAttribute(SessionAttr.CURRENT_USER);
//         OrderEntity order = orderService.findByOrderId(cancelOrderDto.getOrderId());

//         order.setOrderStatus("Đã huỷ đơn");
//         if (cancelOrderDto.getReason().equals("Mục khác...")) {
//             order.setOrderNoteCancelled(cancelOrderDto.getComments());
//         } else {
//             order.setOrderNoteCancelled(cancelOrderDto.getReason());
//         }
//         order.setPaymentStatus(2);
//         order.setDateReceive(new Timestamp(System.currentTimeMillis()));

//         emailService.queueEmailCancelOrderByCustomer(order);
//         orderService.save(order);

//         // tao ra thông báo vào bảng notification
//         createNotification(order.getId(), users, "Đơn hàng " + order.getId() + " đã huỷ.");
//     }

//     @PostMapping(value = "order/create-order", consumes = {"application/json;charset=UTF-8"})
//     private void createOrder(@RequestBody OrderDto ordersDto) {
//         String orderId = ordersDto.getOrderId();
//         String discountId = ordersDto.getDiscountId();

//         int paymentStatus = ordersDto.getPaymentStatus();

//         boolean paymentType = "COD".equals(ordersDto.getPaymentMethod());

//         AccountEntity users = (AccountEntity) session.getAttribute(SessionAttr.CURRENT_USER);

//         OrderEntity order = new OrderEntity();
//         order.setId(orderId);
//         order.setUserId(users.getId());
//         if (StringUtils.isNotEmpty(discountId)) {
//             orders.setDiscountId(discountId);
//         }
//         order.setPaymentStatus(paymentStatus);
//         order.setPaymentType(paymentType);
//         order.setOrderStatus("Chờ xác nhận");
//         order.setOrderShipCost(BigDecimal.valueOf(ordersDto.getShippingFee()));

//         UserPaymentDto userPayment = ordersDto.getUser_payment();
//         if (userPayment != null) {
//             order.setToName(userPayment.getFullname());
//             order.setToPhone(userPayment.getPhoneNumber());
//             order.setToEmail(ordersDto.getEmail());
//             order.setToProvince(userPayment.getProvinceName());
//             order.setToDistrict(userPayment.getDistrictName());
//             order.setToWard(userPayment.getWardName());
//             order.setToAddress(userPayment.getAddress());
//         }

//         order.setOrderNote(ordersDto.getNoted());
//         order.setDateCreated(new Date(System.currentTimeMillis()));
//         order.setDateExpected(ordersDto.getDateExpected());

//         if (!paymentType) {
//             order.setDatePayment(new Timestamp(System.currentTimeMillis()));
//         }

//         // lưu đơn hàng vào db
//         OrderService.save(order);

//         // gửi mail đơn hàng
//         if (paymentStatus == 0 || paymentStatus == 1) {
//             emailService.queueMailCreateOrder(ordersDto);
//         }

//         // tạo ra order item sau khi lưu đơn hàng
//         Object[] cartsList = ordersDto.getProductCartDto().getCartsList();
//         createOrderItem(orderId, cartsList);

//         // xoá giỏ hàng
//         deleteCart(cartsList);

//         // tao ra thông báo vào bảng notification
//         createNotification(orderId, users, "Đơn hàng " + orderId + " đã tạo.");
//     }

//     // // tạo ra order deitail sau khi lưu đơn hàng
//     private void createOrderItem(String orderId, Object[] cartsList) {
//         for (Object cart : cartsList) {
//             if (cart instanceof LinkedHashMap) {
//                 OrderDetailEntity orderItems = new OrderDetailEntity();

//                 CartEntity carts = EntityDtoUtils.convertToEntity(cart, CartEntity.class);
//                 ProductEntity products = productService.findProductByProductId(carts.getProductId());

//                 // // kiểm tra xem có giảm giá không
//                 // SaleOff saleOff = saleOffService.findByProductId(products.getId());

//                 // if (saleOff != null && saleOff.getIsActive()) {
//                 //     orderItems.setPrice(saleOff.getSaleValue());
//                 // } else {
//                 //     orderItems.setPrice(products.getPrice());
//                 // }

//                 orderItems.setOrderId(orderId);
//                 orderItems.setProductId(carts.getProductId());
//                 orderItems.setQuantity(carts.getQuantity());
//                 orderItemService.save(orderItems);

//                 decreaseQuantityProduct(orderItems.getProductId(), orderItems.getQuantity());
//             }
//         }
//     }

//     // xoá giỏ hàng sau khi đặt hàng thành công
//     private void deleteCart(Object[] cartsList) {
//         for (Object cart : cartsList) {
//             if (cart instanceof LinkedHashMap) {
//                 CartEntity carts = EntityDtoUtils.convertToEntity(cart, CartEntity.class);
//                 cartService.delete(carts.getId());
//             }
//         }
//     }

//     // // giảm số lượng sp trong đơn hàng vừa đặt
//     // private void decreaseQuantityProduct(String productId, int quantity) {
//     //     ProductEntity product = productService.findProductByProductId(productId);

//     //     if (product != null) {
//     //         int currentQuantity = product.getQuantity();

//     //         if (currentQuantity >= quantity) {
//     //             int newQuantity = currentQuantity - quantity;
//     //             product.setQuantity(newQuantity);
//     //             productService.save(product);
//     //         }
//     //     }
//     // }

//     // // lưu vào bảng thông báo để hiển thị thông báo ở admin
//     // private void createNotification(String orderId, AccountEntity users, String message) {
//     //     NotificationOrder notification = new NotificationOrder();
//     //     notification.setOrderId(orderId);
//     //     notification.setUserId(users.getId());
//     //     notification.setMessage(message);
//     //     notification.setIsSeen(true);
//     //     notification.setDateCreated(new Timestamp(System.currentTimeMillis()));
//     //     notificationService.save(notification);
//     // }
// }
