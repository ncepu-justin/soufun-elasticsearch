package com.ncepu.service.search;

import lombok.Data;

/**
 * Created by Justin
 * 2018/10/9  10:20
 */
@Data
public class HouseSuggest {

    private String input;
    private int weight = 10; // 默认权重


}
