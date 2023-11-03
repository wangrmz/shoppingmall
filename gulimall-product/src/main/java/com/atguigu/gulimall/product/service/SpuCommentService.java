package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * ��Ʒ����
 *
 * @author wangrmz
 * @email wangrmz202095@163.com
 * @date 2023-10-02 12:32:48
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

