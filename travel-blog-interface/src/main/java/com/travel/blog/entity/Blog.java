package com.travel.blog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
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
@TableName("t_blog")
public class Blog implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 图片
     */
    private String img;

    /**
     * 创建时间
     */
    private LocalDate created;

    /**
     * 获赞数量 (被顶数量）
     */
    private Integer praise_num;

    /**
     * 阅读数量
     */
    private Integer read_num;

    /**
     * 收藏数量
     */
    private Integer collection_num;

    /**
     * 分享数量
     */
    private Integer share_num;


}
