package net.guides.springboot.Freelance;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("/L")
	public String hello() {
		
		return"index";
		
		
		
	}
	
	@PostMapping("/aff")
	@ResponseBody
	public String welcome(@RequestParam (name="email") String email,
			              @RequestParam (name="nameF") String nameF,
			              @RequestParam (name="nameL") String nameL) {
		
		return "<h2>"+ email+ "<br>"+ nameF+"<br>"+  nameL +"</h2> ";
	}
	

}
