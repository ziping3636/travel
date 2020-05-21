package com.travel.scenic.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.travel.scenic.entity.ScenicArea;
import com.travel.scenic.entity.ScenicAreaVo;
import com.travel.scenic.mapper.ScenicAreaMapper;
import com.travel.scenic.service.IScenicAreaService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * InnoDB free: 5120 kB 服务实现类
 * </p>
 *
 * @author yjj
 * @since 2020-05-18
 */
@Service
public class ScenicAreaServiceImpl extends ServiceImpl<ScenicAreaMapper, ScenicArea> implements IScenicAreaService {

    @Autowired
    private ScenicAreaMapper scenicAreaMapper;

    @Override
    public Page selectAll(Page page, ScenicArea scenicArea) {
        return scenicAreaMapper.selectAll(page, scenicArea);
    }

    @Override
    public Page<ScenicAreaVo> findScenicAreaVo(Page<ScenicAreaVo> page, ScenicAreaVo scenicAreaVo) {
        return scenicAreaMapper.findScenicAreaVo(page,scenicAreaVo);
    }
}
