package com.zbc.point.service;


import com.zbc.point.dto.PointDTO;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author StormT1King
 */
public interface PointService {

    PointDTO queryUserPoint(Integer userId);
}
