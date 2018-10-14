package cn.yiyang.model.service;

import cn.yiyang.model.domain.User;
import org.springframework.stereotype.Service;

/**
 * @Auther: Administrator
 * @Date: 2018/10/13 16:59
 * @Description:
 */
public interface UserService {
    User getUserById(String userId);
}
