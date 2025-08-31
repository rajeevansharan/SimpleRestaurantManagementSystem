package com.project.RestaurantManagement.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;


import java.math.BigDecimal;

@Entity
@Data
public class MenuItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description;

    @NotNull
    @Positive
    private BigDecimal price;

    private boolean available = true;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}