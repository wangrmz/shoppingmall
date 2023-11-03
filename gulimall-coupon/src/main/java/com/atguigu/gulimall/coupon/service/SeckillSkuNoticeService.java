package com.atguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * ��ɱ��Ʒ֪ͨ����
 *
 * @author wangrmz
 * @email wangrmz202095@163.com
 * @date 2023-10-05 15:14:17
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

