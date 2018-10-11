package org.cloud.demo.helloword;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {

    //将从远程配置获取app.hello这个key
	//@Value("${app.hello}")
    String bar;

    //根据配置的不同输出不同
    @RequestMapping("/test")
    String hello(){
        return "This is " + bar;
    }
}