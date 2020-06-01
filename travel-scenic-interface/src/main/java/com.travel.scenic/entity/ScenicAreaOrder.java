package com.travel.scenic.entity;

import java.math.BigDecimal;
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
 * @since 2020-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_scenic_area_order")
public class ScenicAreaOrder implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 订单编号
     */
    private String orderNumber;

    private Integer userId;

    /**
     * 景区ID
     */
    private Integer scenicId;

    /**
     * 数量
     */
    private Integer number;

    /**
     * 单价
     */
    private BigDecimal singlePrice;

    /**
     * 总价
     */
    private BigDecimal sumPrice;

    /**
     * 0:待支付、1:支付成功、2:已取消
     */
    private Integer status;

    private Integer isDel;


}
