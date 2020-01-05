package com.springbootmybatisplus.demo.model.dto;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;
import lombok.Data;

/**
 * ClassName: UserDto
 * Function:  TODO
 * Date:      2020/1/5 14:58
 * author     QingCheng
 * version    V1.0
 */
@Data
public class UserDto {
    //分页
    @ApiModelProperty(value = "当前页码")
    private Integer page; //当前页第一页是0

    @ApiModelProperty(value = "每页条数")
    private Integer limit;//每页步长

    @ApiModelProperty(value = "总条数")
    private Long count;//总条数
}
