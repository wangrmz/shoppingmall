package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author wangrmz
 * @email wangrmz202095@163.com
 * @date 2023-10-05 16:26:12
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
