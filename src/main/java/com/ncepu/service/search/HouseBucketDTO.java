package com.ncepu.service.search;

import lombok.Data;

/**
 * Created by Justin
 * 2018/10/10  15:36
 */
@Data
public class HouseBucketDTO {
    /**
     * 聚合bucket的key
     */
    private String key;

    /**
     * 聚合结果值
     */
    private long count;

    public HouseBucketDTO(String key, long count) {
        this.key = key;
        this.count = count;
    }
}
