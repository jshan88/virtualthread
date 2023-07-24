package com.jshan.virtualthread;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String getThreadName() {
        return Thread.currentThread().getName();
    }

    @GetMapping("/block")
    public String getBlockedResponse() throws InterruptedException {
        Thread.sleep(1000);
        return "OK";
    }
}
