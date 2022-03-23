package com.zbc.point.mapper;

import com.zbc.point.dto.PointDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author StormT1King
 */
@Mapper
@Repository
public interface PointMapper {

    PointDTO queryUserPoint(Integer userId);

}
