package com.zbc.common.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author StormT1King
 */
@Data
public class BaseDTO {

    private Short isDelete;
    private Date createdDate;
    private String createdUser;
    private String modifiedUser;
    private Date modifiedDate;
}
