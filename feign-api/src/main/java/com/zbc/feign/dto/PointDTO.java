package com.zbc.feign.dto;

import com.zbc.feign.common.dto.BaseDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author StormT1King
 * 用户可用积分 冻结积分信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PointDTO extends BaseDTO {

    private Integer id;
    private Integer userId;
    // 可用积分
    private Integer availablePoints;
    // 冻结积分
    private Integer freezingPoints;
    // 可用风暴币
    private Integer availableCurreny;

    private PointFlowDetailDTO pointFlowDetail;


}
