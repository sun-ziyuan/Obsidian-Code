package com.ziyuan;

import lombok.*;

import java.util.HashMap;

/**
 * @author szy
 * @date 2023/5/31 22:16
 */
public class LombokMain {

}


@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor(force = true)
class User{
    static String s = "ss";
    final int ids = 10;
    @NonNull private Integer id;
    private String userName;
    private String password;
    private String phone;
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private String email;
}

@Value
class User1{
    static String s = "ss";
    final int ids = 10;
    private Integer id;
    private String userName;
    private String password;
    private String phone;
    private String email;
}
