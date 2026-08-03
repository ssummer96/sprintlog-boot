package com.sprintlog.sprintlogboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class WhoAmIController {
    @GetMapping("/whoami")
    public Map<String,String> whoami() {
        String host = System.getenv("HOSTNAME");
        return Map.of("host", host != null ? host : "unknown");
    }
}
