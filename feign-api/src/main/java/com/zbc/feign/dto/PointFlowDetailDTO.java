package com.zbc.feign.dto;


import com.zbc.feign.common.dto.BaseDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author StormT1King
 * 详细流水信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PointFlowDetailDTO extends BaseDTO {

    private Integer id;
}
