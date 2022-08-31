package cn.xx.core.tools;

import cn.xx.core.pojo.User;

/**
 * 处理用户的工具类
 *
 * @author 徐鑫
 */
public class UserTools {
    public static boolean isManager(User user) {
        return user.getPermission() == User.MANAGER || user.getPermission() == User.SYSTEM_MANAGER;
    }

    public static boolean isTourist(User user) {
        return user.getPermission() == User.TOURIST;
    }

    /**
     * 检查user的id是否符合学号格式
     */
    public static boolean checkIdFormat(User user) {
        String id = user.getId();
        return id.matches("^20[2|1]\\d{9}");
    }
}
