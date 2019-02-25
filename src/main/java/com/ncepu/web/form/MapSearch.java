package com.ncepu.web.form;

import lombok.Data;

/**
 * Created by Justin
 * 2018/10/10  20:02
 */
@Data
public class MapSearch {

    private String cityEnName;

    /**
     * 地图缩放级别
     */
    private int level = 12;
    private String orderBy = "lastUpdateTime";
    private String orderDirection = "desc";
    /**
     * 左上角
     */
    private Double leftLongitude;
    private Double leftLatitude;

    /**
     * 右下角
     */
    private Double rightLongitude;
    private Double rightLatitude;

    private int start = 0;
    private int size = 5;
}
