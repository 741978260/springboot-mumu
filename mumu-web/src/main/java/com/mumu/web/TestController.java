package com.mumu.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/11/25
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/")
    public void test(){

    }
}
