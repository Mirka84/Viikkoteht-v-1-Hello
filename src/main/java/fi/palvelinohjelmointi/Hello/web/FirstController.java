package fi.palvelinohjelmointi.Hello.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {
	
	@RequestMapping("hello")
	@ResponseBody
	
	public String returnGreetingForName(@RequestParam(name = "location") String paikka, @RequestParam(name="firstname") String nimi) {
		return "Welcome to the " + paikka + " " + nimi + "!"; 
	}

}
