package com.zbc.user.controller;

import com.zbc.user.service.UserService;
import com.zbc.user.dto.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author StormT1King
 */
@RestController
@RequestMapping("/api")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")

    public UserDTO login(@RequestBody UserDTO userDto) {
        log.info("login方法开始执行，用户 {}.", userDto.getId());
        return userService.login(userDto);
    }

}
