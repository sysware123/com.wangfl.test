package com.sysware.wfl.action;

import com.sysware.wfl.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author SPC-044
 * @date 15:45
 * @Version 1.0
 */
public class LonginAction {

    public static void main(String[] sage){
        ApplicationContext beans=new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) beans.getBean("user");
        System.out.println(user);

    }
}
