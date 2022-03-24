package com.zbc.user.service.impl;

import com.zbc.feign.client.PointClient;
import com.zbc.feign.dto.PointDTO;
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
    @Autowired
    PointClient pointClient;

    @Override
    public UserDTO login(UserDTO userDTO) {
        UserDTO userInfo = userMapper.queryUserInfo(userDTO);
        PointDTO pointDTO = pointClient.queryUserPoint(userDTO.getId());
        userInfo.setPointDTO(pointDTO);
        return userInfo;
    }

}
