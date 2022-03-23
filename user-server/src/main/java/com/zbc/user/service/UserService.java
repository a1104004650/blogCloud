package com.zbc.user.service;

import com.zbc.user.dto.UserDTO;
import org.springframework.stereotype.Service;

/**
 * @author StormT1King
 * 用户Service类
 */
public interface UserService {

    public UserDTO login(UserDTO userDTO);

}
