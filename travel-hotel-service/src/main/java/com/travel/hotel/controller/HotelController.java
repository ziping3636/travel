package com.travel.hotel.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.travel.hotel.entity.Hotel;
import com.travel.hotel.service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yjj
 * @since 2020-05-20
 */
@Controller
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private IHotelService iHotelService;


    @RequestMapping("/list")
    @ResponseBody
    public Page<Hotel> selectAllHotel(@RequestParam(defaultValue = "1") int current, @RequestParam(defaultValue = "5") int size, Hotel hotel) {
        Page page = new Page(current, size);
        QueryWrapper wrapper = new QueryWrapper();
        if(hotel!=null){
            //酒店名称模糊查询
            if(hotel.getHotelName()!=null && !"".equals(hotel.getHotelName())){
                wrapper.like("hotel_name",hotel.getHotelName());
            }
            //出行目的地模糊查询
            if(hotel.getHotelSite()!=null && !"".equals(hotel.getHotelSite())){
                wrapper.like("hotel_site",hotel.getHotelSite());
            }
        }
        return iHotelService.page(page, wrapper);
    }

    /**
     * 酒店的添加
     * @param hotel
     * @return
     */
    @PostMapping("insert")
    @ResponseBody
    public boolean insert(@RequestBody Hotel hotel){
        return iHotelService.save(hotel);
    }

    /**
     * 修改酒店信息
     * @param hotel
     * @return
     */
    @PostMapping("updata")
    @ResponseBody
    public boolean updata(@RequestBody Hotel hotel){
        return iHotelService.updateById(hotel);
    }


}

