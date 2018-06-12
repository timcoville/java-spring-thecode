package com.timcoville.thecode;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@SpringBootApplication
@Controller
@RequestMapping("/")
public class TheCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheCodeApplication.class, args);
	}
	@RequestMapping("")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping(value="/check", method=RequestMethod.POST)
	public String check(@RequestParam(value="guess") String guess, RedirectAttributes redirectAttributes) {

		if (guess.equals("bushido")) {
			return "redirect:/code";
		}
		else {
			redirectAttributes.addFlashAttribute("error", "You Must Train Harder!");
			return "redirect:/";
			
		}
	}
	@RequestMapping("/code")
	public String code() {
		return "code.jsp";
	}
}
