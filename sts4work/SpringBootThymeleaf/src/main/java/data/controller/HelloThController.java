package data.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import data.dto.ShopDto;
import jakarta.servlet.http.HttpSession;

@Controller
public class HelloThController {

	List<ShopDto> list = new ArrayList<>();

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@GetMapping("/hello1")
	public String hello1(Model model) {

		System.out.println("hello1 controller");

		model.addAttribute("message", "Have a Nice Day!!!");
		model.addAttribute("today", new Date());

		ShopDto dto = ShopDto.builder().num(100).sangpum("요가매트").su(10).dan(25000).color("black").build();

		model.addAttribute("dto", dto);
		return "hello1";
	}

	@GetMapping("/hello2")
	public String hello2(String name, int age, Model model) {

		model.addAttribute("hello2_msg", name + "님의 나이는 " + age + "세 입니다");

		return "hello2";
	}

	@GetMapping("/list")
	public String list(Model model) {

		list.add(new ShopDto(1, "핸드크림", 10, 4000, "pink"));
		list.add(new ShopDto(2, "미백크림", 8, 7000, "white"));
		list.add(new ShopDto(3, "클렌징폼", 20, 2000, "green"));
		list.add(new ShopDto(4, "에센스", 15, 4000, "blue"));

		ShopDto dto5 = ShopDto.builder().num(5).sangpum("립밤").su(3).dan(2500).color("블루").build();

		list.add(dto5);

		model.addAttribute("list", list);

		return "list";
	}

	@GetMapping("/detail")
	public String detail(@RequestParam int index, Model model) {
		model.addAttribute("dto", list.get(index));
		return "detail";
	}

	@GetMapping("/login1")
	public String login1(HttpSession session) {
		session.setAttribute("myid", "admin");
		return "login";
	}
	
	@GetMapping("/login2")
	public String login2(HttpSession session) {
		session.setAttribute("myid", "angel");
		return "login";
	}
}
