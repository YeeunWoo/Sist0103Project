package spring.mvc.quiz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuizController {
	// 3개의 매핑 주소를 포워드한 주소로 연결하고 결과물은 해당 포워드된 jsp파일에서 나타내기
	
	@GetMapping(value = "happy")
	public String happy() {		
		return "nice";
	}
	@GetMapping(value = "hello")
	public String hello(Model model) {
		model.addAttribute("msg","안녕하세요");
		
		return "hello";
	}
	@GetMapping(value = "nice/like")
	public String nice(Model model) {
		model.addAttribute("name","우예은");
		model.addAttribute("hp","010-1234-5678");
		model.addAttribute("addr","인천시 연수구 송도동");
		
		return "happy";
	}
}
