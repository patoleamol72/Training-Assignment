package com.amol.pem.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.amol.pem.domain.User;
import com.amol.pem.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userservice;
	
	@Autowired
    HttpSession session;
	
	
	@RequestMapping(value="/home.htm", method=RequestMethod.GET)
	 public ModelAndView showHomePage(){
		 ModelAndView model=new ModelAndView("home");
		 return model;
	  }
	
	 
	 @RequestMapping(value="/logoutProcess.htm", method=RequestMethod.GET)
	  public ModelAndView showlogoutPage(){
		
		 ModelAndView model=new ModelAndView("login");
		 return model;
	  }
	 
	 @RequestMapping(value="/login.htm", method=RequestMethod.GET)
	  public ModelAndView showloginPage(){
		
		 ModelAndView model=new ModelAndView("login");
		 return model;
	  }
	 
	 

	 
	 @RequestMapping(value="/registration.htm", method=RequestMethod.GET)
	  public ModelAndView showRegisterPage(){
		
		 ModelAndView model=new ModelAndView("registration");
		 return model;
	  }
	 
	 @RequestMapping(value="/submitUserRegister.htm", method=RequestMethod.POST)
	  public ModelAndView submitUserRegisterPage( User user){	 
		 
		
		 userservice.userRegistration(user);
		 ModelAndView model=new ModelAndView("login");
		
		 return model;
	  }
	 
	 
	 
	 
	 @RequestMapping(value="/logincheck.htm", method=RequestMethod.POST)
    public ModelAndView showUser(HttpServletRequest request,HttpServletResponse response,@RequestParam("loginName")String username,@RequestParam("password")String password){
		 User user;
		 try{
		  user=userservice.logIn(username);
		 }
		 catch(Exception e){
			 ModelAndView model=new ModelAndView("login");
			 model.addObject("msg","Wrong username or Password.....!!");
			 return model;
		 }
		 if(user.getPassword().equals(password)){
			  session=request.getSession();

			 session.setAttribute("name", user.getName());
			 session.setAttribute("username", user.getLoginName());
		 ModelAndView model=new ModelAndView("addCategory");
		 model.addObject("msg",session.getAttribute("name"));
		 return model;
		 }
		 else {
			 
			 ModelAndView model=new ModelAndView("login");
			 model.addObject("msg","Wrong username or Password...!!");
			 return model;
		 }
		 

	 }

}
