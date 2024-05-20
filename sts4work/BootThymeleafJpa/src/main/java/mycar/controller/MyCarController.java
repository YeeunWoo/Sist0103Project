package mycar.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import mycar.data.MyCarDto;
import mycar.repository.MyCarDao;

@Controller
@RequiredArgsConstructor
public class MyCarController {

	private final MyCarDao dao;

	@GetMapping("/")
	public String start() {
		return "redirect:list";
	}

	@GetMapping("/list")
	public String list(Model model) {

		List<MyCarDto> list = dao.getAllCars();

		model.addAttribute("list", list);
		model.addAttribute("totalcount", list.size());

		return "mycar/mycarlist";
	}

	@GetMapping("/writeform")
	public String form() {

		return "mycar/mycarform";
	}

	@PostMapping("/insert")
	public String insert(@ModelAttribute MyCarDto dto, @RequestParam MultipartFile carupload, HttpSession session) {

		String realPath = session.getServletContext().getRealPath("/save");
		System.out.println(realPath);
		String uploadName = carupload.getOriginalFilename();
		dto.setCarphoto(uploadName);

		// 실제 업로드
		try {
			carupload.transferTo(new File(realPath + "//" + uploadName));
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// db에 저장
		dao.insertMyCar(dto);
		
		return "redirect:list";
	}
}
