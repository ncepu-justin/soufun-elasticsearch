package com.ncepu.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Created by Justin
 * 2018/8/20  18:04
 */
@Data
public class SupportAddressDTO {

    private Long id;
    @JsonProperty(value = "belong_to")
    private String belongTo;

    @JsonProperty(value = "en_name")
    private String enName;

    @JsonProperty(value = "cn_name")
    private String cnName;

    private String level;

    private double baiduMapLongitude;

    private double baiduMapLatitude;
}
