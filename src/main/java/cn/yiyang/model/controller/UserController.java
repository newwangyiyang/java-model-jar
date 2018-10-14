package cn.yiyang.model.controller;

import cn.yiyang.common.utils.JUtils.word.ExportWord;
import cn.yiyang.common.utils.ResultBean;
import cn.yiyang.model.domain.User;
import cn.yiyang.model.service.UserService;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: Administrator
 * @Date: 2018/10/13 17:01
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUserById")
    public ResultBean getUserById(String userId) {
        User user = userService.getUserById(userId);
        return ResultBean.success(user);
    }

    @GetMapping("/exportWord")
    public void exportWord(HttpServletResponse response) throws IOException {
        Map<String, Object> map = Maps.newHashMap();
        map.put("title", "大标题001你好001");
        map.put("content", "主体内容");
        ExportWord ew = new ExportWord();
        //以后获取resource路径下文件使用该方法
        ClassPathResource resource = new ClassPathResource("template/one.ftl");
        ew.exported(map,"one", "one", response);
    }
}
