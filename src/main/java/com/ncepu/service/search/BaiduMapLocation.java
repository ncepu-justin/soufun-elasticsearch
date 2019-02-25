package com.ncepu.service.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 百度位置信息
 * Created by Justin
 * 2018/10/10  17:24
 */
@Data
public class BaiduMapLocation {

    // 经度
    @JsonProperty("lon")
    private double longitude;

    // 纬度
    @JsonProperty("lat")
    private double latitude;
}
