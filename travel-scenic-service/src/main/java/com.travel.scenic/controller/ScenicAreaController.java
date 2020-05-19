package com.travel.scenic.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.travel.scenic.entity.ScenicArea;
import com.travel.scenic.service.IScenicAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * InnoDB free: 5120 kB 前端控制器
 * </p>
 *
 * @author yjj
 * @since 2020-05-18
 */
@RestController
@RequestMapping("/scenic_area")
public class ScenicAreaController {

    @Autowired
    private IScenicAreaService iScenicAreaService;

    @RequestMapping("list")
    public Page selectAll(@RequestParam(defaultValue = "1") int current, @RequestParam(defaultValue = "10") int size, ScenicArea scenicArea) {
        Page page = new Page(current, size);
        QueryWrapper wrapper = new QueryWrapper();
        if (scenicArea != null) {
            if (scenicArea.getName() != null && !"".equals(scenicArea.getName())) {
                wrapper.like("name", scenicArea.getName());
            }
            if (scenicArea.getStar() != null) {
                wrapper.eq("star", scenicArea.getStar());
            }
        }
        return iScenicAreaService.page(page, wrapper);
    }
}

