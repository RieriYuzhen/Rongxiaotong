package com.soft.demo6.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.soft.demo6.pojo.TbUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbUserMapper extends BaseMapper<TbUser> {
}
