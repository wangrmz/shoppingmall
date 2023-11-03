package com.atguigu.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * ���ֱ仯��ʷ��¼
 *
 * @author wangrmz
 * @email wangrmz202095@163.com
 * @date 2023-10-05 16:02:10
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

