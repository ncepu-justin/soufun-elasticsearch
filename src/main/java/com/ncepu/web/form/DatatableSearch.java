package com.ncepu.web.form;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by Justin
 * 2018/8/21  20:20
 */
@Data
public class DatatableSearch {

    /**
     * Datatables要求回显字段
     */
    private int draw;

    /**
     * Datatables规定分页字段
     */
    private int start;
    private int length;

    private Integer status;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createTimeMin;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createTimeMax;

    private String city;
    private String title;
    /*升序还是降序*/
    private String direction;
    /*通过那个字段来搜索*/
    private String orderBy;
}
