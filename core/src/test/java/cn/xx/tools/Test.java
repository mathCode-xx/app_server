package cn.xx.tools;

import cn.xx.core.pojo.User;
import cn.xx.core.tools.UserTools;

public class Test {

    @org.junit.Test
    public void checkId() {
        User user = new User();
        user.setId("202930035227");
        System.out.println(UserTools.checkIdFormat(user));
    }
}
