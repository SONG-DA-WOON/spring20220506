package org.zerock.controller.ex05;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.controller.ex03.Customer;
import org.zerock.controller.ex03.Employee;

@Controller
@RequestMapping("ex09")
public class Ex09Controller {
	
	@RequestMapping("sub01")
	public void method01(String name, Model model) {
		// 1. request 파라미터 수집/가공
		System.out.println(name);
		// 3. model에 attribute 추가
		model.addAttribute("name", name);
		
		// 4. view forward: ex09/sub01.jsp
	}
	
	// /ex09/sub02?name=sunja
	@RequestMapping("sub02")
	public String method02(@ModelAttribute("name") String name) {
		
		return "ex09/sub01";
	}
	
	// /ex09/sub02?address=seoul&email=dmdm@naver.com
	@RequestMapping("sub03")
	public void method03(@ModelAttribute("address") String address,
						 @ModelAttribute("email") String email) {
	}
	
	// /ex09/sub04?name=trump&age=40&address=new york
	@RequestMapping("sub04")
	public void method04(@ModelAttribute("customer") Customer cus) {
		
	}
	
	@RequestMapping("sub05")
	public String method05(@ModelAttribute Customer cus) {
		
		return "/ex09/sub04";
	}
	
	@RequestMapping("sub06")
	public String method06(Customer cus) {
		return "ex09/sub04";
	}
	
	@RequestMapping("sub07")
	public String method07(@ModelAttribute("employee") Employee emp) {
		return "/ex09/sub07";
	}
	
	@RequestMapping("sub08")
	public String method08(@ModelAttribute("customer") Customer cus) {
		return "/ex09/sub08";
	}
	
	@RequestMapping("sub09")
	public String method09(Customer cus) {
		return "/ex09/sub09";
	}
	// ?name=sunja&salary=50000&email=sunja@gmail.com
	
	// method07 작성
	// org.zerock.controller.ex03.employee
	// 쿼리스트링으로 넘어온 파라미터 값들을 세팅해서
	// model에 "employee"라는 이름의 attribute로 추가되고
	// /ex09/sub07 뷰로 포워드 되도록
}
