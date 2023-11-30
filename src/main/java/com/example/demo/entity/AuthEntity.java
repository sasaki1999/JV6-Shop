// package com.example.demo.entity;

// import lombok.AllArgsConstructor;
// import lombok.Getter;
// import lombok.NoArgsConstructor;
// import lombok.Setter;
// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.ManyToOne;

// import java.io.Serializable;

// import com.fasterxml.jackson.annotation.JsonBackReference;

// @Getter
// @Setter
// @Entity
// @NoArgsConstructor
// @AllArgsConstructor
// public class AuthEntity implements Serializable {
//     @Id
//     @GeneratedValue(strategy = GenerationType.AUTO)
//     @Column(name = "id", nullable = false)
//     private Long id;

//     @ManyToOne
//     @JoinColumn(name = "role_id", nullable = false, referencedColumnName = "role_id")
//     @JsonBackReference
//     private RoleEntity role;

//     @ManyToOne
//     @JoinColumn(name = "account_id", nullable = false, referencedColumnName = "account_id")
//     @JsonBackReference
//     private AccountEntity user;
// }
