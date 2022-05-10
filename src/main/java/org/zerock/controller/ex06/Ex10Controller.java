package org.zerock.controller.ex06;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.controller.ex03.Customer;
import org.zerock.controller.ex03.Employee;

@Controller
@RequestMapping("ex10")
public class Ex10Controller {
	
	@RequestMapping("sub01")
	public String method01(RedirectAttributes rttr) {
		System.out.println("ex10/sub01 경로에서 일함");
		rttr.addAttribute("address", "seoul");
		
		return "redirect:/ex10/sub02";
	}
	
	@RequestMapping("sub02")
	public void method02() {
		System.out.println("ex10/sub02 경로에서 일함!");
	}
	
	@RequestMapping("sub03")
	public String method03(RedirectAttributes rttr) {
		rttr.addAttribute("name", "sunja");
		rttr.addAttribute("age", 99);
		rttr.addAttribute("address", "seoul");
		
		return "redirect:/ex10/sub04";
	}
	
	@RequestMapping("sub04")
	public void method04() {	
	}
	
	@RequestMapping("sub05")
	public String method05(RedirectAttributes rttr) {
		Customer c = new Customer();
		c.setAge(88);
		c.setName("captain");
		c.setAddress("ny");
		
		rttr.addFlashAttribute("customer", c);
		
		return "redirect:/ex10/sub06";
	}
	
	@RequestMapping("sub06")
	public void method06(Model model) {
		System.out.println(model.asMap().get("customer")); 
	}
	
	@RequestMapping("sub07")
	public String method07(RedirectAttributes rttr) {
		Employee emp = new Employee();
		emp.setEmail("33@naver.com");
		emp.setName("dkdks");
		emp.setSalary(123123);
		
		rttr.addFlashAttribute("employee", emp);
		
		return "redirect:/ex10/sub08";
	}
	
	@RequestMapping("sub08")
	public void method08(Model model) {
		System.out.println(model.asMap().get("employee"));
	}
}
