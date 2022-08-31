package cn.xx.bbs.controller;

import cn.xx.core.pojo.Result;
import cn.xx.feign.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 * @author 徐鑫
 */
@RestController
@RequestMapping("/bbs")
public class TestController {
    @Autowired
    private UserClient userClient;

    @RequestMapping("/test")
    public Result test() {
        return Result.success("测试成功！");
    }
    @GetMapping("/feign")
    public Result testFeign() {
        return userClient.test();
    }
}
