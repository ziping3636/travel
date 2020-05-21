package com.travel.hotel.service.impl;

import com.travel.hotel.entity.Hotel;
import com.travel.hotel.mapper.HotelMapper;
import com.travel.hotel.service.IHotelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yjj
 * @since 2020-05-20
 */
@Service
public class HotelServiceImpl extends ServiceImpl<HotelMapper, Hotel> implements IHotelService {
}
