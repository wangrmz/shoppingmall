package com.atguigu.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author wangrmz
 * @email wangrmz202095@163.com
 * @date 2023-10-05 16:26:12
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

