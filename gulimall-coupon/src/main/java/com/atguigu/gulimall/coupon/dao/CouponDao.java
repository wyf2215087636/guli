package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author wangyifei
 * @email 2215087636@qq.com
 * @date 2020-07-16 23:50:21
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
