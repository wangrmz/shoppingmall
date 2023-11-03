package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku��Ϣ
 *
 * @author wangrmz
 * @email wangrmz202095@163.com
 * @date 2023-10-02 12:32:48
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

