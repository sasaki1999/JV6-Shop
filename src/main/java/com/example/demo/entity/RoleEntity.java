// package com.example.demo.entity;

// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;

// import java.util.Set;

// import com.fasterxml.jackson.annotation.JsonManagedReference;

// import jakarta.persistence.CascadeType;
// import jakarta.persistence.Id;
// import jakarta.persistence.OneToMany;
// import jakarta.persistence.Table;
// import jakarta.validation.constraints.NotEmpty;
// import lombok.AllArgsConstructor;
// import lombok.Getter;
// import lombok.NoArgsConstructor;
// import lombok.Setter;

// @Getter
// @Setter
// @Entity
// @NoArgsConstructor
// @AllArgsConstructor
// @Table(name = "Role")
// public class RoleEntity {
//     @Id
//     @GeneratedValue(strategy = GenerationType.AUTO)
//     @Column(name = "role_id", nullable = false)
//     private Long roleId;
    
//     @OneToMany(mappedBy = "Role", cascade = CascadeType.ALL )
//     @JsonManagedReference
//     private Set<AuthEntity> auth;
    
//     @NotEmpty(message = "Role name not empty")
//     private String role_name;

    
// }
