package com.ncepu.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Justin
 * 2018/8/20  21:56
 */
@Entity
@Table(name = "house_tag")
@Data
public class HouseTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "house_id")
    private Long houseId;

    private String name;

    public HouseTag() {
    }

    public HouseTag(Long houseId, String name) {
        this.houseId = houseId;
        this.name = name;
    }
}
