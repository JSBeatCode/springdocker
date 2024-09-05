package com.springdocker.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//@RestController
@Controller
public class SpringdockerController {

	@GetMapping("/")
	public String hello(Model model) {
        // 현재 시간 가져오기
        LocalDateTime currentTime = LocalDateTime.now();
        
        // 기본 형식으로 출력
        System.out.println("현재 시간: " + currentTime);
		return "index";
	}
	
}
