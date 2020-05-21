package com.travel.scenic.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.travel.scenic.entity.ScenicArea;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.travel.scenic.entity.ScenicAreaVo;

/**
 * <p>
 * InnoDB free: 5120 kB Mapper 接口
 * </p>
 *
 * @author yjj
 * @since 2020-05-18
 */
public interface ScenicAreaMapper extends BaseMapper<ScenicArea> {

    Page selectAll(Page page, ScenicArea scenicArea);

    Page<ScenicAreaVo> findScenicAreaVo(Page<ScenicAreaVo> page,ScenicAreaVo scenicAreaVo);
}
