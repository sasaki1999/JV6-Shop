package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.io.Serializable;


@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Auth")
public class AuthEntity implements Serializable {
    @Id
<<<<<<< HEAD
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "auth_id", nullable = false)
    private Integer AuthId;
=======
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "auth_id", nullable = false)
    private Long AuthId;
>>>>>>> a0055219833e44ed740e1595573fb0fe64cfbfc8

    @ManyToOne
    @JoinColumn(name = "account_id")
    AccountEntity account;

    @ManyToOne
    @JoinColumn(name = "role_id")
    RoleEntity role;

}
