package com.atguigu.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author wangrmz
 * @email wangrmz202095@163.com
 * @date 2023-10-05 16:26:12
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

