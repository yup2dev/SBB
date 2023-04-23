package com.sbb.exam.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @RequestMapping("/sbb")
    @ResponseBody
    public String index() {
        System.out.println("접근 잘되네");

        return "ㅎ2";
    }

    @GetMapping("/page1")
    @ResponseBody
    public String showPage1() {
        return "<div>test</div>";
    }

    @GetMapping("/plus")
    @ResponseBody
    public int showPlus(int a, int b) {
        return a + b;
    }
}
