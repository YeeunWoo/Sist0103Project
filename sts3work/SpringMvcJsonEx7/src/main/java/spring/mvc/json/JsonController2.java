package spring.mvc.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import spring.data.PhotoDto;

@RestController
public class JsonController2 {
	
	@GetMapping("/foodlist3")
	public Map<String, Object> list3(@RequestParam String foodname){
		
		List<PhotoDto> list = new ArrayList<PhotoDto>();
		
		list.add(new PhotoDto("ġŲ", "1.png"));
		list.add(new PhotoDto("������ġ", "8.jpg"));
		list.add(new PhotoDto("��������", "11.jpg"));
		list.add(new PhotoDto("��ġ��", "5.jpg"));
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("foodname", "���¸޴�");
		map.put("photo", "4.jpg");
		
		for(PhotoDto dto: list) {
			if(foodname.equals(dto.getFoodname())) {
				map.put("foodname", dto.getFoodname());
				map.put("photo", dto.getPhoto());
			}
		}
		
		return map;
	}
}
