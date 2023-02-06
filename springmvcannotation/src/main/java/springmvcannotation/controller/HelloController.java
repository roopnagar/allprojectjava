package springmvcannotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/hello.htm")
	public ModelAndView greet() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("welcome");
		mv.addObject("name", "roop");
		return mv;
		
	}

	@RequestMapping("/hellog.htm")
	public ModelAndView greet(@RequestParam("name") String name) {

		ModelAndView mv = new ModelAndView();
		
		// Give name of JSP page OR View
		mv.setViewName("welcome");

		// Data that you want to show on view
		mv.addObject("name", name);

		return mv;
	}

	@RequestMapping("/hellostring.htm")
	public String greetings() {
		return "hello";
	}

}
