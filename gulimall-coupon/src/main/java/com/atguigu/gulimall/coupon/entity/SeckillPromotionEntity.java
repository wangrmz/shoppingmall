package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ��ɱ�
 * 
 * @author wangrmz
 * @email wangrmz202095@163.com
 * @date 2023-10-05 15:14:17
 */
@Data
@TableName("sms_seckill_promotion")
public class SeckillPromotionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * �����
	 */
	private String title;
	/**
	 * ��ʼ����
	 */
	private Date startTime;
	/**
	 * ��������
	 */
	private Date endTime;
	/**
	 * ������״̬
	 */
	private Integer status;
	/**
	 * ����ʱ��
	 */
	private Date createTime;
	/**
	 * ������
	 */
	private Long userId;

}
