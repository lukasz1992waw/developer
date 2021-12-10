package com.developer.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="houses")
@Data
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "number")
    private int number;

    @Column(name = "name")
    private String name;

    @Column(name = "area")
    private BigDecimal area;

    @Column(name = "image_url")
    private String image_url;

    @Column(name = "floors")
    private int floors;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "active")
    private boolean active;

}
