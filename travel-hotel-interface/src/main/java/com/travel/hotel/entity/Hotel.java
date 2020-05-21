package com.travel.hotel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * <p>
 * 
 * </p>
 *
 * @author yjj
 * @since 2020-05-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_hotel")
public class Hotel implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自增
id


     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 酒店名称
     */
    private String hotelName;

    /**
     * 入住时间
     */
    private LocalDate goTime;

    /**
     * 离店时间
     */
    private LocalDate outTime;

    /**
     * 酒店地址
     */
    private String hotelSite;

    /**
     * 酒店评分
     */
    private Integer hotelGrade;

    /**
     * 酒店类型
     */
    private String hotelType;

    /**
     * 附近景区
     */
    private String nearbyScenic;

    /**
     * 酒店价格
     */
    private BigDecimal hotelPrice;

    /**
     * 酒店销量
     */
    private Integer hotelSales;

    /**
     * 酒店简介
     */
    private String hotelBrief;


}
