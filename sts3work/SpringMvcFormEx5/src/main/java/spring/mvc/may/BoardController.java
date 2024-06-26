package spring.mvc.may;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@GetMapping("/form")
	public String form1() {
		return "board/writeform";
	}
	
	@PostMapping("/process")
	public ModelAndView process(@RequestParam String name,
			@RequestParam String date,
			@RequestParam String gender,
			@RequestParam(required = false) String msg,
			/* 
			 * required는 true가 기본값, 항목이 없어도 에러가 안 나게 하려면 false
			 * 또는 defaultValue를 주면 된다.
			 * */
			@RequestParam(name = "pageNum", defaultValue = "1") int currentPage) {
		ModelAndView model = new ModelAndView();
		
		model.addObject("name", name);
		model.addObject("date", date);
		model.addObject("gender", gender);
		model.addObject("msg", msg);
		model.addObject("currentPage", currentPage);
		
		// 포워드
		model.setViewName("board/result");
		
		return model;
	}
	
	@GetMapping("/result2")
	public String result2(Model model) {
		
		model.addAttribute("myimg1", "../image/01.png");
		model.addAttribute("title", "내가 만든 음식");
		
		return "board/result2";
	}
	
	//list.jsp로 포워드만
	@GetMapping("/list")
	public String list() {
		return "board/list";
	}
	
}
