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
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;

import java.io.Serializable;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnore;



@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Account")
public class AccountEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id",nullable = false)
    private Long accountId;
    
    @Column(name = "user_name")
    @NotEmpty(message = "Username not empty")
    private String userName;

    @Column(name = "password")
    @NotEmpty(message = "Password not empty")
    private String password;

    @Column(name = "full_name")
    @NotEmpty(message = "Fullname not empty")
    private String fullName;

    @Column(name = "Address")
    @NotEmpty(message = "Address not empty")
    private String address;

    @Column(name = "Email")
    @Email(message = "Email is not valid")
    private String email;

    @Column(name = "phone_number", unique = true)
    @NotEmpty(message = "Phone not empty")
    @Max(value=10,message ="Phone number must be 10 numbers")
    private String phoneNumber;

    @JsonIgnore
    @OneToOne(mappedBy = "account")
    private AuthEntity auth;

    @JsonIgnore
    @OneToMany(mappedBy = "account")
    List<OrderEntity> order;
}
