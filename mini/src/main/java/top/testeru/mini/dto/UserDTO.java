package top.testeru.mini.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author www.testeru.top
 * @version 1.0.0
 * @Project top.testeru.mini.dto
 * @Description 用户业务实体类
 * @createTime 2023年03月23日 19:14:43
 */

@Getter//getter方法
@Setter//setter方法
@ToString//tostring方法
@ApiModel(description = "用户实体类")
public class UserDTO {
    @ApiModelProperty(value = "用户名", example = "李四", required = true)
    private String name;
    @ApiModelProperty(value = "年龄", example = "100", required = true)
    private Integer age;
}