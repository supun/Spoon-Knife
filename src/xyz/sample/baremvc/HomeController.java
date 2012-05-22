package xyz.sample.baremvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public String home() {
		System.out.println("HomeController:PAssing through..");
		return "WEB-INF/views/home.jsp";
	}

}
