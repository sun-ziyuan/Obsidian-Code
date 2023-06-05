package com.ziyuan;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Tolerate;

import java.io.Serializable;
import java.util.Date;

/**
 * @author szy
 * @date 2023/6/1 21:57
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO implements Serializable {
    private Long id;
    private String name;
    private Integer age;
    private String address;
    private Date createTime;

}


@Data
@Builder
class UserDTO1 implements Serializable {
    private Long id;
    private String name;
    private Integer age;
    private String address;
    private Date createTime;

    @Tolerate       // 忽略此方法
    public UserDTO1() {
    }
}

/* 错误用法1
@Data
@Builder
class UserDTO1 implements Serializable {
    private Long id;
    private String name;
    private Integer age;
    private String address;
    private Date createTime;
    public UserDTO1() {
    }
}*/
