package com.travel.scenic.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
@TableName("t_scenic_area_comment")
public class ScenicAreaComment implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 景区id
     */
    private Integer scenic_area_id;

    /**
     * 用户id
     */
    private Integer user_id;

    /**
     * 内容
     */
    private String content;

    /**
     * 评论时间
     */
    private LocalDateTime created;

    /**
     * 图片
     */
    private String img;


}
