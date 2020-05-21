package com.travel.scenic.mapper;

import com.travel.scenic.entity.District;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.travel.scenic.entity.DistrictVo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yjj
 * @since 2020-05-21
 */
public interface DistrictMapper extends BaseMapper<District> {

    List<DistrictVo> selectAll();
}
