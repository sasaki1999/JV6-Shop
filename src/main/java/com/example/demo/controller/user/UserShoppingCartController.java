// package com.example.demo.controller.user;

// import java.util.Collections;
// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;

// import com.main.utils.SessionAttr;
// import com.example.demo.dto.CartDto;
// import com.example.demo.entity.AccountEntity;
// import com.example.demo.entity.CartEntity;
// import com.example.demo.entity.ProductDetailEntity;
// import com.example.demo.entity.ProductEntity;
// import com.example.demo.service.user.CartService;
// import com.example.demo.service.user.ProductService;
// import com.example.demo.utils.EntityDtoUtils;
// import com.example.demo.service.user.ProductDetailService;

// import jakarta.servlet.http.HttpSession;

// @Controller
// @RequestMapping("/user")
// public class UserShoppingCartController {
//     @Autowired
//     CartService cartService;

//     @Autowired
//     ProductService productService;

//     @Autowired
//     HttpSession session;

//     @GetMapping("shopping-cart")
//     public List<Object[]> getCarts() {
//         AccountEntity users = (AccountEntity) session.getAttribute(SessionAttr.CURRENT_USER);

//         if (users != null) {
//             return cartService.findListCartByUserId(account.getId());
//         } else {
//             return Collections.emptyList();
//         }
//     }

//     @GetMapping("shopping-cart/cart-interceptor")
//     public boolean getCartAuthentication() {
//         AccountEntity users = (AccountEntity) session.getAttribute(SessionAttr.CURRENT_USER);

//         if (users != null) {
//             List<Object[]> objects = cartService.findListCartByUserId(users.getId());
//             return objects != null && !objects.isEmpty();
//         } else {
//             return false;
//         }
//     }

//     // lấy ra tổng số lượng sản phẩm tronmg giỏ hàng
//     @GetMapping("shopping-cart/quantity-cart")
//     public Integer getQuantityCart() {
//         AccountEntity users = (AccountEntity) session.getAttribute(SessionAttr.CURRENT_USER);

//         if (users != null) {
//             return cartService.countCartByUserId(users.getId());
//         } else {
//             return 0;
//         }
//     }

//     // lấy ra cart bằng cartId
//     @GetMapping("shopping-cart/get-by-id/{cardId}")
//     public CartEntity getCartById(@PathVariable int cardId) {
//         if (cardId != 0) {
//             return cartService.findByCartId(cardId);
//         } else {
//             return null;
//         }
//     }

//     @GetMapping("shopping-cart/productPriceByUserId")
//     public List<Integer> getProductPriceList() {
//         AccountEntity users = (AccountEntity) session.getAttribute(SessionAttr.CURRENT_USER);
//         return productService.findPriceProductByUserId(users.getId());
//     }

//     // thêm vào giỏ hàng
//     @PostMapping("shopping-cart/them-vao-gio-hang/{productId}&{quantity}")
//     public void addProductIntoCart(@PathVariable String productId, @PathVariable int quantity) {
//         CartDto cartsDto = new CartDto();

//         AccountEntity account = (AccountEntity) session.getAttribute(SessionAttr.CURRENT_USER);
//         CartEntity exitsCart = cartService.findProductExits(account.getId(), productId);
//         ProductEntity products = productService.findProductByProductId(productId);
//         ProductDetailEntity productdetail = ProductDetailService.findProductDetailByProductDetailId(productdetailId);

//         if (exitsCart != null) {
//             if (exitsCart.getQuantity() < productdetail.getQuantity()) {
//                 if (quantity < productdetail.getQuantity()) {
//                     exitsCart.setQuantity(exitsCart.getQuantity() + quantity);
//                     cartService.save(exitsCart);
//                 }
//             }
//         } else {
//             cartsDto.setUserId(account.getId());
//             cartsDto.setProductId(productId);
//             cartsDto.setQuantity(quantity);
//             CartEntity carts = EntityDtoUtils.convertToEntity(cartsDto, CartEntity.class);
//             cartService.save(carts);
//         }
//     }

//     @PostMapping("shopping-cart/update-quantity-cart")
//     public void updateCartItem(@RequestParam("cardId") int cardId, @RequestParam("quantity") int quantity) {
//         CartEntity carts = cartService.findByCartId(cardId);

//         if (carts != null) {
//             carts.setQuantity(quantity);
//             cartService.save(carts);
//         }
//     }

//     // xoá sản phẩm khỏi giỏ hàng
//     @GetMapping("shopping-cart/xoa-gio-hang/{cartId}")
//     public void deleteCart(@PathVariable int cartId) {
//         cartService.delete(cartId);
//     }

// }
