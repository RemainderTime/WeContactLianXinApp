package cn.xf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RemainderTime
 * @date 2019/6/8 19:16
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){

        return "Hello";
    }


}
