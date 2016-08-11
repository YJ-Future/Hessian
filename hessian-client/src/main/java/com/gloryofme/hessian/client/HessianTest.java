package com.gloryofme.hessian.client;

import com.gloryofme.hessian.server.service.HelloService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author gloryzyf<bupt_zhuyufei@163.com>
 */
@RunWith(JUnit4ClassRunner.class)
@Transactional
public class HessianTest {


    private static HelloService helloService;

    @BeforeClass
    public static void init() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        helloService = (HelloService) context.getBean("helloService");
    }

    @Test
    public void test() {
        String result = helloService.sayHello("gloryofme");
        System.out.println(result);
    }
}
