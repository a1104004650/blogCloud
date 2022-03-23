package com.zbc.user.mapper;

import com.zbc.user.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author StormT1King
 */
@Mapper
@Repository
public interface UserMapper {

    UserDTO queryUserInfo(UserDTO userDTo);

}
