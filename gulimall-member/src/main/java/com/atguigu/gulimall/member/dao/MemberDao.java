package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wangyifei
 * @email 2215087636@qq.com
 * @date 2020-07-16 23:54:30
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
