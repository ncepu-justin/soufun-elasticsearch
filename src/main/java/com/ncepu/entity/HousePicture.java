package com.ncepu.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Justin
 * 2018/8/20  21:55
 */
@Entity
@Table(name = "house_picture")
@Data
public class HousePicture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "house_id")
    private Long houseId;

    private String path;

    @Column(name = "cdn_prefix")
    private String cdnPrefix;

    private int width;

    private int height;

    private String location;
}
