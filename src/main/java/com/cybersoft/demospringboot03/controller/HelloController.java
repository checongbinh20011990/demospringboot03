package com.cybersoft.demospringboot03.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Controller : Dùng để định nghĩa đường dẫn mà nội dung đường dẫn trả ra html
 * @ResponseBody : Giúp cho @Controller có thể trả ra kiểu String dùng để viết API
 *
 * @RestController : Là sự kết hợp của @Controller và @ResponseBody => Viết API
 */
// /hello/cybersoft
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("")
    public String hello(){
        return "Hello Spring boot";
    }

    @PostMapping("/cybersoft")
    public String helloCybersoft(){
        return "Hello Spring Cybersoft";
    }

}
