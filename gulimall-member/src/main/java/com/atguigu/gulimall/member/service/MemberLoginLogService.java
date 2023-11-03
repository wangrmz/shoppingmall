package com.atguigu.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * ��Ա��¼��¼
 *
 * @author wangrmz
 * @email wangrmz202095@163.com
 * @date 2023-10-05 16:02:10
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

