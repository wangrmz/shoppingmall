package com.atguigu.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * ֧����Ϣ��
 *
 * @author wangrmz
 * @email wangrmz202095@163.com
 * @date 2023-10-05 16:18:49
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

