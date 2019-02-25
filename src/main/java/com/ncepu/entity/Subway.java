package com.ncepu.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Justin
 * 2018/8/20  21:26
 */
@Entity
@Table(name = "subway")
@Data
public class Subway {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "city_en_name")
    private String cityEnName;
}
