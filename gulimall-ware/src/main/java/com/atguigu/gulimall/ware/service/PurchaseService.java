package com.atguigu.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author wangrmz
 * @email wangrmz202095@163.com
 * @date 2023-10-05 16:26:12
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

