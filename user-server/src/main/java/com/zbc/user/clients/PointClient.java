package com.zbc.user.clients;

import com.zbc.user.dto.PointDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author StormT1King
 * point模块的
 */
@FeignClient("pointserver")
public interface PointClient {

    @PostMapping("/api/point/queryUserPoint")
    PointDTO queryUserPoint(Integer userId);

}
