package com.ziyuan;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Tolerate;

import java.util.Date;

/**
 * @author szy
 * @date 2023/6/2 15:31
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TestLombok {
    @Builder.Default
    private String aa = "zzzz";

    public static void main(String[] args) {
        TestLombok build = TestLombok.builder().build();
        System.out.println(build);
    }
}
