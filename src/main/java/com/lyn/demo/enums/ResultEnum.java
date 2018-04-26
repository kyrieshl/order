package com.lyn.demo.enums;

public enum ResultEnum {
    SUCESS(0,"成功"),
    FAIL(1,"失败");

    private Integer code;
    private String msg;
    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
