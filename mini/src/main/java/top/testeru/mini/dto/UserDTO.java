package top.testeru.mini.dto;

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
public class UserDTO {
    private String name;
    private Integer age;
}