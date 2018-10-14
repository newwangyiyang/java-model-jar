package cn.yiyang.model.controller;

import cn.yiyang.common.utils.JUtils.word.ExportWord;
import cn.yiyang.common.utils.ResultBean;
import cn.yiyang.common.utils.UploadUtils;
import cn.yiyang.model.domain.User;
import cn.yiyang.model.service.UserService;
import com.google.common.collect.Maps;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
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
@CrossOrigin
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

    @ApiOperation(value = "图片上传功能测试")
    @ApiImplicitParam(name = "file", required = true, value = "图片流列表", dataType = "MultipartFile")
    @PostMapping("/uploadImg")
    public void uploadImg(@RequestParam MultipartFile[] file, HttpServletRequest request) throws Exception {
        for (MultipartFile multipartFile : file) {
            UploadUtils.upload(multipartFile, request);
        }
        System.out.println(request.getSession().getServletContext().getRealPath("/"));
    }
}
