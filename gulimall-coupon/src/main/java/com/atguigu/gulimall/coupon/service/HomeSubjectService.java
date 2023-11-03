package com.atguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * ��ҳר�����jd��ҳ����ܶ�ר�⣬ÿ��ר�������µ�ҳ�棬չʾר����Ʒ��Ϣ��
 *
 * @author wangrmz
 * @email wangrmz202095@163.com
 * @date 2023-10-05 15:14:17
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

