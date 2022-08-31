package cn.xx.cache;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * redis 中存储数据的类型
 * @author 徐鑫
 */
@Data
public class RedisData {
    /**
     * 持续时间
     */
    private LocalDateTime expireTime;
    /**
     * 数据
     */
    private Object data;
}
