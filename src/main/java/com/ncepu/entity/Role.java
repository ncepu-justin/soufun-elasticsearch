package com.ncepu.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Justin
 * 2018/8/20  10:22
 */
@Entity
@Table(name = "role")
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_id")
    private Long userId;
    private String name;
}