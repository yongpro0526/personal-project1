package com.diary.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public String health() {
        return "✅ 일기장 서버 작동 중! 포트: 9001";
    }

    @GetMapping("/test")
    public String test() {
        return "🚀 테스트 API 성공!";
    }
}