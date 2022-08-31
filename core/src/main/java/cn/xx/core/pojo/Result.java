package cn.xx.core.pojo;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 统一的响应类
 * @author 徐鑫
 */
@Data
public class Result {
    public static int SUCCESS_CODE = 200;
    public static int FAIL_CODE = 500;

    private int statusCode;
    private String message;
    private Map<String, Object> data;

    static public Result success() {
        Result m = new Result();
        m.setMessage("请求成功");
        m.setStatusCode(SUCCESS_CODE);
        return m;
    }

    static public Result success(String message) {
        Result m = new Result();
        m.setStatusCode(SUCCESS_CODE);
        m.setMessage(message);
        return m;
    }

    static public Result fail() {
        Result r = new Result();
        r.setMessage("请求失败");
        r.setStatusCode(FAIL_CODE);
        return r;
    }

    static public Result fail(String message) {
        Result r = new Result();
        r.setMessage(message);
        r.setStatusCode(FAIL_CODE);
        return r;
    }

    public Result addData(String key, Object value) {
        if (this.data == null) {
            this.data = new HashMap<>(0);
        }
        this.data.put(key, value);
        return this;
    }
}
