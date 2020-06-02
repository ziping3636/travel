package com.travel.scenic.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.travel.scenic.config.ResultEntity;
import com.travel.scenic.entity.ScenicArea;
import com.travel.scenic.service.IScenicAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

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

    @RequestMapping("/list")
    public Page selectAll(@RequestParam(defaultValue = "1") int current, @RequestParam(defaultValue = "10") int size, ScenicArea scenicArea) {
        Page page = new Page(current, size);
        return iScenicAreaService.selectAll(page, scenicArea);
    }

    @RequestMapping("/insert")
    public ResultEntity insert(@RequestBody ScenicArea scenicArea) {
        if (iScenicAreaService.save(scenicArea)) {
            return ResultEntity.ok("添加成功");
        }
        return ResultEntity.error("添加失败");
    }

    @RequestMapping("/update")
    public ResultEntity update(@RequestBody ScenicArea scenicArea) {
        if (iScenicAreaService.updateById(scenicArea)) {
            return ResultEntity.ok("修改成功");
        }
        return ResultEntity.error("修改失败");
    }

    @RequestMapping("/delete")
    public ResultEntity delete(Integer id) {
        if (iScenicAreaService.removeById(id)) {
            return ResultEntity.ok("删除成功");
        }
        return ResultEntity.error("删除失败");
    }

    @GetMapping("/getById")
    public ResultEntity getById(Integer id) {
        ScenicArea byId = iScenicAreaService.getById(id);
        if (byId != null) {
            return ResultEntity.ok(byId);
        }
        return ResultEntity.error("查询失败");
    }
}

