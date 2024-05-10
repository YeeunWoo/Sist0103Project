package spring.db.member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	MemberDaoInter memInter;

	@GetMapping("list")
	public String list(Model model)
	{
		List<MemberDto> list=memInter.getAllMembers();
		model.addAttribute("list", list);
		
		return "member/memberlist";
	}
	
	@GetMapping("writeform")
	public String form()
	{
		return "member/addform";
	}
	
	@GetMapping("/idcheck")
	@ResponseBody
	public Map<String, Integer> idcheck(@RequestParam String id)
	{
		Map<String, Integer> map=new HashMap<String, Integer>();
		int count=memInter.getIdCheck(id);
		System.out.println(count);
		map.put("count", count);
		return map;
	}
	
	@PostMapping("/insert")
	public String insert(@ModelAttribute MemberDto dto)
	{
		memInter.insertMember(dto);
		return "redirect:list";
	}
	
	@GetMapping("/updateform")
	public ModelAndView uform(@RequestParam String num) {
		ModelAndView model = new ModelAndView();
		
		MemberDto dto = memInter.getMember(num);
		//dto를 request에 저장
		model.addObject("dto", dto);
		//포워드
		model.setViewName("member/updateform");
		
		return model;
	}
	
	@PostMapping("/update")
	public String update(@ModelAttribute MemberDto dto) {
		//비밀번호 체크
		int n = memInter.passCheck(dto.getNum(), dto.getPass());
		if(n==1) {
			//비번이 맞을 경우 수정 후 목록
			memInter.updateMember(dto);
			return "redirect:list";
		}else {
			return "member/passfail";
		}
	}
	
}