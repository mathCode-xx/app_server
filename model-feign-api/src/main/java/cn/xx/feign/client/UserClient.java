package cn.xx.feign.client;

import cn.xx.core.pojo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *  user service 暴露的接口
 *
 * @author 徐鑫
 */
@FeignClient(value = "userService")
public interface UserClient {

    @GetMapping("/user/test")
    Result test();

}
