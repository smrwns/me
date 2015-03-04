package me.smrwns.thirty;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/test")
	public void test() {
		System.out.println("test controller executed");
	}
}
