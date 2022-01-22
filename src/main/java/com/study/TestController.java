package com.study;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
public class TestController {

    @RequestMapping(path = "test")
    public String test() {
        return "this is test Jenkins 111";
    }
}
