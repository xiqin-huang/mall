package com.atguigu.gulimall.product.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * ClassName: Catelog2Vo
 * Package: com.atguigu.gulimall.product.vo
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/11/15 - 10:29
 * @Version: v1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Catelog2Vo {
    private String catalog1Id;//1级父分类
    private List<Catelog3Vo> catalog3List;//3级子分类
    private String id;
    private String name;

    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class Catelog3Vo{
        private String catalog2Id;
        private String id;
        private String name;
    }
}