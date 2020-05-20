package com.travel.scenic.entity;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * InnoDB free: 5120 kB
 * </p>
 *
 * @author yjj
 * @since 2020-05-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_scenic_area")
public class ScenicArea implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 景区id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 景区名
     */
    private String name;

    /**
     * 景区简介
     */
    private String info;

    private BigDecimal price;

    /**
     * 景区级别
     */
    private Integer star;

    /**
     * 省
     */
    private Integer provinceId;

    /**
     * 市
     */
    private Integer cityId;

    /**
     * 县
     */
    private Integer countyId;

    /**
     *  图片
     */
    private String pic;

    @TableField(exist = false)
    private String provinceName;

    @TableField(exist = false)
    private String cityName;

    @TableField(exist = false)
    private String countyName;
}
