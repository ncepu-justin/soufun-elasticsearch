package com.ncepu.web.dto;

import lombok.Data;

/**
 * Created by Justin
 * 2018/8/20  22:28
 */
@Data
public class HouseDetailDTO {
    private String description;

    private String layoutDesc;

    private String traffic;

    private String roundService;

    private int rentWay;

    private Long adminId;

    private String address;

    private Long subwayLineId;

    private Long subwayStationId;

    private String subwayLineName;

    private String subwayStationName;
}
