package com.ncepu.service.search;

import lombok.Data;

/**
 * Created by Justin
 * 2018/8/26  16:20
 */
@Data
public class HouseIndexMessage {

    public static final String INDEX = "index";
    public static final String REMOVE = "remove";

    public static final int MAX_RETRY = 3;

    private Long houseId;
    private String operation;
    private int retry = 0;
    /**
     * 默认构造器 防止jackson序列化失败
     */
    public HouseIndexMessage() {
    }

    public HouseIndexMessage(Long houseId, String operation, int retry) {
        this.houseId = houseId;
        this.operation = operation;
        this.retry = retry;
    }
}
