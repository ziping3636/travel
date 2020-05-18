package com.travel.blog.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.List;

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
    private Integer praiseNum;

    /**
     * 阅读数量
     */
    private Integer readNum;

    /**
     * 收藏数量
     */
    private Integer collectionNum;

    /**
     * 分享数量
     */
    private Integer shareNum;

    //博客的评论
    //数据库中不存在
    @TableField(exist = false)
    private List<BlogComment> blogCommentList;


}
