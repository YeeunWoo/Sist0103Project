package spring.mvc.quiz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuizController {
	// 3���� ���� �ּҸ� �������� �ּҷ� �����ϰ� ������� �ش� ������� jsp���Ͽ��� ��Ÿ����
	
	@GetMapping(value = "happy")
	public String happy() {		
		return "nice";
	}
	@GetMapping(value = "hello")
	public String hello(Model model) {
		model.addAttribute("msg","�ȳ��ϼ���");
		
		return "hello";
	}
	@GetMapping(value = "nice/like")
	public String nice(Model model) {
		model.addAttribute("name","�쿹��");
		model.addAttribute("hp","010-1234-5678");
		model.addAttribute("addr","��õ�� ������ �۵���");
		
		return "happy";
	}
}
