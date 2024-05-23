package myshop.controller;

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
import myshop.dto.ShopDto;
import myshop.service.MyShopService;

@Controller
@RequiredArgsConstructor
public class MyShopController {

	private final MyShopService shopService;

	@GetMapping("/")
	public String list(Model model) {
		int totalCount = shopService.getTotalCount();
		List<ShopDto> list = shopService.getAllSangpums();

		model.addAttribute("totalCount", totalCount);
		model.addAttribute("list", list);

		return "myshop/shoplist";
	}

	@GetMapping("/addform")
	public String form() {
		return "myshop/shopform";
	}

	@PostMapping("/insert")
	public String insert(@ModelAttribute ShopDto dto, @RequestParam MultipartFile upload, HttpSession session) {

		String realPath = session.getServletContext().getRealPath("/photo");
		String photoname = upload.getOriginalFilename();
		dto.setPhoto(photoname);
		try {
			upload.transferTo(new File(realPath + "\\" + photoname));
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// db insert
		shopService.insertShop(dto);
		return "redirect:./";
	}
}
