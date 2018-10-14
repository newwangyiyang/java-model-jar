package cn.yiyang.model.dao;

import cn.yiyang.model.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther: Administrator
 * @Date: 2018/10/13 16:51
 * @Description:
 */
public interface UserDao {
    User getUserById(@Param("userId") String userId);
}
