package com.xiaobaicai.demo.infrastructure.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaobaicai.demo.infrastructure.dataobject.UserDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xiaobaicai
 * @since 2023-08-20
 */
@Mapper
public interface UserMapper extends BaseMapper<UserDO> {

}
