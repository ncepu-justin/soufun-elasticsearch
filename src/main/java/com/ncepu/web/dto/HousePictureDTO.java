package com.ncepu.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Created by Justin
 * 2018/8/20  22:28
 */
@Data
public class HousePictureDTO {
    private Long id;

    @JsonProperty(value = "house_id")
    private Long houseId;

    private String path;

    @JsonProperty(value = "cdn_prefix")
    private String cdnPrefix;

    private int width;

    private int height;
}
