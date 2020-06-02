package com.travel.scenic.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.travel.scenic.entity.ScenicArea;
import com.baomidou.mybatisplus.extension.service.IService;
import com.travel.scenic.entity.ScenicAreaVo;

/**
 * <p>
 * InnoDB free: 5120 kB 服务类
 * </p>
 *
 * @author yjj
 * @since 2020-05-18
 */
public interface IScenicAreaService extends IService<ScenicArea> {

    Page selectAll(Page page, ScenicArea scenicArea);

    Page<ScenicAreaVo> findScenicAreaVo(Page<ScenicAreaVo> page, ScenicAreaVo scenicAreaVo);
}
