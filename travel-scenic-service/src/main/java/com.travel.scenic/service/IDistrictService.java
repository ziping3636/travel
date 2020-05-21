package com.travel.scenic.service;

import com.travel.scenic.entity.District;
import com.baomidou.mybatisplus.extension.service.IService;
import com.travel.scenic.entity.DistrictVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yjj
 * @since 2020-05-21
 */
public interface IDistrictService extends IService<District> {

    List<DistrictVo> selectAll();
}
