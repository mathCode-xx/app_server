package cn.xx.bbs;

import cn.xx.feign.client.UserClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 论坛模块的启动类
 * @author 徐鑫
 */
@SpringBootApplication
@EnableFeignClients(clients = UserClient.class)
public class BbsApplication {
    public static void main(String[] args) {
        SpringApplication.run(BbsApplication.class, args);
    }
}
