package me.smrwns.thirty;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/daily")
public class DailyController {
	
	@RequestMapping("/initialScreen")
	public void initialScreen() {
		System.out.println("daily controller executed!");
	}

}
