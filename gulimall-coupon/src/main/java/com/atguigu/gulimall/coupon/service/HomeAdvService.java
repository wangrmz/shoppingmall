package com.atguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * ��ҳ�ֲ����
 *
 * @author wangrmz
 * @email wangrmz202095@163.com
 * @date 2023-10-05 15:14:17
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

