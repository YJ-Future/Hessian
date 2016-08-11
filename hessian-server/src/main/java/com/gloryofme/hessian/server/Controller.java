package com.gloryofme.hessian.server;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author gloryzyf<bupt_zhuyufei@163.com>
 */
@RequestMapping("/hessian")
public class Controller {

    @RequestMapping(value = "/hello/{msg}",method = RequestMethod.GET)
    public void hello(@PathVariable("msg") String msg){
    }
}
