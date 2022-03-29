package com.zbc.point.controller;

import com.zbc.point.dto.PointDTO;
import com.zbc.point.service.PointService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author StormT1King
 */
@RestController
@RequestMapping("/api/point")
@Slf4j
public class PointServiceController {

    @Autowired
    PointService pointService;

    @RequestMapping("/queryUserPoint")
    public PointDTO queryUserPoint(@RequestBody Integer userId) {
        log.info("queryUserPoint方法开始执行，用户 {}.", userId);
        return pointService.queryUserPoint(userId);
    }

}
