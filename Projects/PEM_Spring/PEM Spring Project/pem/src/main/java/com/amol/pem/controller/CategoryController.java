package com.amol.pem.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.amol.pem.domain.Category;
import com.amol.pem.service.CategoryService;

@Controller
@RequestMapping("/user")
public class CategoryController {
	
	
	@Autowired
	CategoryService catgoryservice;
	
	@Autowired
	HttpSession session;
	
	@RequestMapping(value="/addCategory.htm", method=RequestMethod.GET)
	  public ModelAndView showAddCategory(){
		 
		 session.setAttribute("username", session.getAttribute("username"));
		 ModelAndView model=new ModelAndView("addCategory");
		 return model;
	  }
	 
	 
	 
	 @RequestMapping(value="/submitCategory.htm", method=RequestMethod.POST)
	  public ModelAndView submitCategory( @ModelAttribute("app") Category category ){
				 
		 String username= (String) session.getAttribute("username");

		 category.setUserId(username);
		 
		 catgoryservice.addCategory(category);
		 ModelAndView model=new ModelAndView("catAddSuccess");
		 model.addObject("msg","Category added Successfully..!!");	 
		
		 return model;
	  }
	 
	 @RequestMapping(value="/listCategory.htm")
		protected ModelAndView listAllCategory(HttpServletRequest request, HttpServletResponse response) throws Exception {
			
		 ModelAndView model = new ModelAndView("listCategory");
			String userid=session.getAttribute("username").toString();
			System.out.println("user---"+userid);
		
			List<Category> catlist = new ArrayList<Category>();
			
			catlist = catgoryservice.listAllCategory(userid);			
			
		
			model.addObject("catlist", catlist);
			return model;
		}

}
