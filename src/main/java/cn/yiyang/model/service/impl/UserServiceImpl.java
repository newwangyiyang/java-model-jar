package cn.yiyang.model.service.impl;

import cn.yiyang.model.dao.UserDao;
import cn.yiyang.model.domain.User;
import cn.yiyang.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: Administrator
 * @Date: 2018/10/13 17:00
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(String userId) {
        return userDao.getUserById(userId);
    }
}
