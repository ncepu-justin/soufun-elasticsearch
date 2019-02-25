package com.ncepu.base;

import lombok.Data;

/**
 * Created by Justin
 * 2018/8/21  20:14
 */
@Data
public class ApiDataTableResponse extends ApiResponse {
    private int draw;
    private long recordsTotal;
    private long recordsFiltered;

    public ApiDataTableResponse(ApiResponse.Status status) {
        this(status.getCode(), status.getStandardMessage(), null);
    }

    public ApiDataTableResponse(int code, String message, Object data) {
        super(code, message, data);
    }
}
