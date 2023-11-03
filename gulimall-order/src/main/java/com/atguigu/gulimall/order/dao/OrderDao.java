package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * ����
 * 
 * @author wangrmz
 * @email wangrmz202095@163.com
 * @date 2023-10-05 16:18:49
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
