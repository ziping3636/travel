package com.travel.scenic.service.impl;

import com.travel.scenic.entity.District;
import com.travel.scenic.entity.DistrictVo;
import com.travel.scenic.mapper.DistrictMapper;
import com.travel.scenic.service.IDistrictService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yjj
 * @since 2020-05-21
 */
@Service
public class DistrictServiceImpl extends ServiceImpl<DistrictMapper, District> implements IDistrictService {

    @Autowired
    private DistrictMapper districtMapper;

    @Override
    public List<DistrictVo> selectAll() {
        return districtMapper.selectAll();
    }
}
