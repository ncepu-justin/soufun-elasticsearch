package com.ncepu.web.dto;

import lombok.Data;

/**
 * Created by Justin
 * 2018/8/23  15:38
 */
@Data
public class UserDTO {
    private Long id;
    private String name;
    private String avatar;
    private String phoneNumber;
    private String lastLoginTime;
}
