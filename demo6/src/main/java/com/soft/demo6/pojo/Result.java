package com.soft.demo6.pojo;
import lombok.Data;
@Data
public class Result {
    private Integer code;
    private Object result;

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public Integer getCode() {
        return code;
    }

    public Object getResult() {
        return result;
    }
}
