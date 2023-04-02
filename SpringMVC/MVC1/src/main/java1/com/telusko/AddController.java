package com.telusko;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

	public ModelAndView add(HttpServletRequest request,HttpServletResponse response) 
	{
		int i=Integer.parseInt(request.getParameter("t1"));
		int j=Integer.parseInt(request.getParameter("t2"));
		
		int k=i+j;
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Display.jsp");
		mv.addObject("result",k);
		return mv;	
	}
	
}
