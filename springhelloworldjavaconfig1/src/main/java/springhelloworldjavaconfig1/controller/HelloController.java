package springhelloworldjavaconfig1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView greet() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("welcome");
		mv.addObject("name", "roop");
		return mv;
}}
