package com.travel.scenic.controller;


import com.travel.scenic.entity.DistrictVo;
import com.travel.scenic.service.IDistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yjj
 * @since 2020-05-21
 */
@RestController
@RequestMapping("/district")
public class DistrictController {

    @Autowired
    private IDistrictService iDistrictService;

    @RequestMapping("list")
    public List<DistrictVo> list() {
        return iDistrictService.selectAll();
    }

}

