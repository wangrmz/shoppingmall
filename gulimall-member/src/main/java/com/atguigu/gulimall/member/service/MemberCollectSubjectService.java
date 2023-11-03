package com.atguigu.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * ��Ա�ղص�ר��
 *
 * @author wangrmz
 * @email wangrmz202095@163.com
 * @date 2023-10-05 16:02:10
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

