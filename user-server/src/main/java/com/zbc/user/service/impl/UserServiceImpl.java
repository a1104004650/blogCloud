package com.zbc.user.service.impl;

import com.zbc.user.dto.UserDTO;
import com.zbc.user.mapper.UserMapper;
import com.zbc.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author StormT1King
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public UserDTO login(UserDTO userDTO) {
        return userMapper.queryUserInfo(userDTO);
    }

}
