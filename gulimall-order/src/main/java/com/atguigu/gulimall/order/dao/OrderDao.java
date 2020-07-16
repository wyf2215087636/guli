package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wangyifei
 * @email 2215087636@qq.com
 * @date 2020-07-17 00:01:42
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
