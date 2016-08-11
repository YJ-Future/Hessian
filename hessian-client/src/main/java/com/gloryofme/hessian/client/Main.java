package com.gloryofme.hessian.client;

import com.gloryofme.hessian.server.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gloryzyf<bupt_zhuyufei@163.com>
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloService hello = (HelloService)context.getBean("helloService");
        String res = hello.sayHello("zhuyufei");
        System.out.println(res);
    }
}
