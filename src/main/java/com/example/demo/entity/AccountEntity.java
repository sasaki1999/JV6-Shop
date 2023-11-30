// package com.example.demo.entity;

// import lombok.AllArgsConstructor;
// import lombok.Getter;
// import lombok.NoArgsConstructor;
// import lombok.Setter;
// import jakarta.persistence.CascadeType;
// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.OneToMany;
// import jakarta.persistence.Table;
// import jakarta.validation.constraints.NotEmpty;

// import java.io.Serializable;
// import java.util.Collection;

// import com.fasterxml.jackson.annotation.JsonManagedReference;

// @Getter
// @Setter
// @Entity
// @NoArgsConstructor
// @AllArgsConstructor
// @Table(name = "Account")
// public class AccountEntity implements Serializable {
//     @Id
//     @GeneratedValue(strategy = GenerationType.AUTO)
//     @Column(name = "account_id", nullable = false)
//     private Long accountId;

//     @Column(name = "username", unique = true)
//     @NotEmpty(message = "Username not empty")
//     private String username;

//     @Column(name = "password")
//     @NotEmpty(message = "Password not empty")
//     private String password;

//     @Column(name = "name")
//     @NotEmpty(message = "Fullname not empty")
//     private String name;

//     @Column(name = "Address")
//     private String address;

//     @Column(name = "Email")
//     private String Email;

//     @Column(name = "phone_number", unique = true)
//     private String phoneNumber;

//     @OneToMany(mappedBy = "Account", cascade = CascadeType.ALL)
//     @JsonManagedReference
//     private Collection<AuthEntity> auth;
// }
