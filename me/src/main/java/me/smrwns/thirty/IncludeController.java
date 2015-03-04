package me.smrwns.thirty;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/include")
public class IncludeController {
	
	@RequestMapping("/navbar")
	public void navbar() {
		System.out.println("nav controller executed!");
	}
	
	@RequestMapping("/footer")
	public void footer() {
		System.out.println("footer controller executed!");
	}
}
