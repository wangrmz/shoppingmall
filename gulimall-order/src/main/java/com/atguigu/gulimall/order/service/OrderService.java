package com.atguigu.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * ����
 *
 * @author wangrmz
 * @email wangrmz202095@163.com
 * @date 2023-10-05 16:18:49
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

