package com.assignment0;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Assignment0Controller {

	/**
	 * Handle the /start endpoint
	 * @return
	 */
	
	@RequestMapping("/start")
	public String start() {
		return "start";
	}
	
	/**
	 * Handle the / endpoint
	 * @return
	 */
	@RequestMapping("/")
	public String index() {
		return "start";
	}
}
