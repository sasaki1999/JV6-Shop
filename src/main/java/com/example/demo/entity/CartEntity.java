package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Cart")
public class CartEntity {
    @Id
<<<<<<< HEAD
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id", nullable = false)
    private Integer cartId;
=======
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cart_id", nullable = false)
    private Long cartId;
>>>>>>> a0055219833e44ed740e1595573fb0fe64cfbfc8

    @Column(name = "quantity")
    @NotEmpty(message = "Quantity not empty")
    private double quantity;

    @Column(name = "price")
    @NotEmpty(message = "Price not empty")
    private double price;

    @Column(name = "total")
    @NotEmpty(message = "Total not empty")
    private double total;

    @ManyToOne
    @JoinColumn(name = "productDetail_id") // Thay đổi tên cột tham chiếu
    private ProductDetailEntity productDetail;

    @OneToOne @JoinColumn(name = "user_id", unique = true)
    private AccountEntity account;
}
