package cn.xx.user.controller;

import cn.xx.core.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试接口
 * @author 徐鑫
 */
@RestController
@RequestMapping("/user")
public class TestController {
    @RequestMapping("/test")
    public Result test() {
        return Result.success("用户控制器测试成功！");
    }
}
