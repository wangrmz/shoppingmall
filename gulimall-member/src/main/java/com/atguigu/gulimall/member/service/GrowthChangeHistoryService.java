package com.atguigu.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * �ɳ�ֵ�仯��ʷ��¼
 *
 * @author wangrmz
 * @email wangrmz202095@163.com
 * @date 2023-10-05 16:02:10
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

