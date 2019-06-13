package com.hamusuta.hellohamusuta.vo.requestVo;

import io.swagger.annotations.ApiParam;

public class TypeVo {

    @ApiParam(value = "类型名称",required = true)
    private String name;
    @ApiParam(value = "启用状态",required = true)
    private Integer status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TypeVo{" +
                "name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
