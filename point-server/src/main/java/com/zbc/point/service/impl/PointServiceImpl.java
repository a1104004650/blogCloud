package com.zbc.point.service.impl;

import com.zbc.point.dto.PointDTO;
import com.zbc.point.mapper.PointMapper;
import com.zbc.point.service.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author StormT1King
 */
@Service
public class PointServiceImpl implements PointService {

    @Autowired
    PointMapper pointMapper;

    @Override
    public PointDTO queryUserPoint(Integer userId) {
        return pointMapper.queryUserPoint(userId);
    }

}
