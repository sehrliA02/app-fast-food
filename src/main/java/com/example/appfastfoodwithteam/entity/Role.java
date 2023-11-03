package com.example.appfastfoodwithteam.entity;

import com.example.appfastfoodwithteam.enums.RolePermissionEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @Enumerated(EnumType.STRING)
    private List<RolePermissionEnum> permissions;
}
