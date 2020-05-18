package com.travel.user.config;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResultEntity implements Serializable {


    private Integer code;
    private String msg;
    private Object data;

    public ResultEntity(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    // ok 的静态方法同一返回
    public static ResultEntity ok(Object data) {
        return new ResultEntity(1001, "ok", data);
    }

    public static ResultEntity error(Object data) {
        return new ResultEntity(4001, "error", data);
    }

    /*public static ResultEntity error(String msg) {
        return new ResultEntity(4004, "error", null);
    }*/
}
