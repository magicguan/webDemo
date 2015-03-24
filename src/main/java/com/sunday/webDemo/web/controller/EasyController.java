package com.sunday.webDemo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * function description.
 * <p><h2>Change History</h2>
 * 2014/8/11 | G | created
 * </p>
 *
 * @author G
 * @version 1.0.0
 */
@Controller
@RequestMapping("/easy")
public class EasyController {

    @RequestMapping("/test")
    public void test() {
        System.out.println("test");
    }
}
