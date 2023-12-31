package com.atguigu.gulimall.search.vo;

import lombok.Data;

import java.util.List;

/**
 * ClassName: SearchParamVo
 * Package: com.atguigu.gulimall.search.vo
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/11/18 - 16:40
 * @Version: v1.0
 */
@Data
public class SearchParam {

    private String keyword;//页面传递的全文匹配关键字

    private Long catalog3Id;//三级分类ID

    /**
     *排序条件:
     *销量：saleCount_asc/desc
     *价格: skuPrice_asc/desc
     *热度评分: hotScore_asc/desc
     */
    private String sort;

    /**
     * 过滤:
     *仅显示有货:hasStock=0/1
     *价格区间:skuPrice=1_500/_500/500_
     * 品牌(多选)
     * 商品属性(多选)
     */
    private Integer hasStock;
    private String skuPrice;
//    private Integer skuPrice1;
//    private Integer skuPrice2;
    private List<Long> brandId;
    private List<String> attrs;
    //分页
    private Integer pageNum = 1;

    private String _queryString;//原生查询条件
}
