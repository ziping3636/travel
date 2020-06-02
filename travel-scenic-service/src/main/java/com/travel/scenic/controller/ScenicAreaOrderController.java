package com.travel.scenic.controller;


import com.travel.scenic.entity.ScenicAreaOrder;
import com.travel.scenic.service.IScenicAreaOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * InnoDB free: 5120 kB 前端控制器
 * </p>
 *
 * @author yjj
 * @since 2020-06-01
 */
@RestController
@RequestMapping("/scenic_area_order/")
public class ScenicAreaOrderController {

    @Autowired
    private IScenicAreaOrderService iScenicAreaOrderService;

    @RequestMapping("list")
    public List<ScenicAreaOrder> list(){
        return  iScenicAreaOrderService.list();
    }

}

