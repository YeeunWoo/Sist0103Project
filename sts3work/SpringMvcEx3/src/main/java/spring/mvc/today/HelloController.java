package spring.mvc.today;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	
	//@RequestMapping(value = "/", method = RequestMethod.GET)
	/*@GetMapping("/")
	public String hello1(Model model) {
		model.addAttribute("name", "우예은");
		model.addAttribute("addr", "서울시 강남구 역삼동");
		
		return "result1";
	}*/
}
