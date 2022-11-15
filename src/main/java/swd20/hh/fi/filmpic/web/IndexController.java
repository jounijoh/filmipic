package swd20.hh.fi.filmpic.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	// index page
	@GetMapping("/index")
	public String getIndex() {
		return "index";
	}
}
