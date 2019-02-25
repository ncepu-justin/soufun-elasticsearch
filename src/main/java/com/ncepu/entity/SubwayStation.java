package com.ncepu.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Justin
 * 2018/8/20  21:26
 */
@Entity
@Table(name = "subway_station")
@Data
public class SubwayStation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "subway_id")
    private Long subwayId;

    private String name;
}
