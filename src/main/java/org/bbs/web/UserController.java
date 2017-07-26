package org.bbs.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bbs.util.VercodeUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
   
	@RequestMapping("/")
	public String index(){
		return "login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(){
		return "main";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String register(){
		
		return "reg";
	}
	@RequestMapping(value="/register/vercode",method=RequestMethod.GET)
	public void vercode(HttpServletRequest req,HttpServletResponse resp){
	  
		resp.setContentType("image/jpeg");
		VercodeUtils.confimVerCode(req, resp);
		
	}
}
