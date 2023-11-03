package com.example.appfastfoodwithteam.entity;

import com.example.appfastfoodwithteam.enums.OrderStatusEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = false)
    private Customer customer;

    @ManyToOne
    private Filial filial; // automatic

    @ManyToOne
    private Employee employee;

    @Enumerated(EnumType.STRING)
    private OrderStatusEnum status;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime receivedAt;

    @Column(nullable = false)
    private LocalDateTime sentAt;

    @Column(nullable = false)
    private LocalDateTime deliveredAt;

    private String number;

    @ManyToOne(optional = false)
    private Product product;

    private double shippingCost; // yetkazib berish narxi

    private int count;

    @Column(nullable = false)
    private String location;
}