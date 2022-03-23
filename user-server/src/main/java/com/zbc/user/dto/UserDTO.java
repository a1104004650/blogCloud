package com.zbc.user.dto;

import com.sun.istack.internal.NotNull;
import com.zbc.common.dto.BaseDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author StormT1King
 * 登录用户类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO extends BaseDTO {

    private String nickName;
    private int age;
    private String birthday;
    private String email;
    private String mobile;
    // 备注
    private String notice;
    private String id;
    @NotNull
    private String pwd;


}
