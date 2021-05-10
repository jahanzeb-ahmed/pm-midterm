package com.service.cart.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class User {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    @NotNull
    private String firstName;
    
    @NotNull
    private String lastName;
    
    private String gender;
    
    @Email
    @NotNull
    @Column(nullable = false,unique = true)
    private String email;
    
    private String phone;
    
    @NotNull
    @Column(unique = true)
    private String username;
    
    @NotNull
    private String password;

    @Embedded
    private Address address;

    private boolean status;
    private LocalDateTime createdDate;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="userId")
    private List<Role> roles;

}
