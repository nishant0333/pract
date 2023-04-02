package com.jtcindia.springmvc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class courseController extends AbstractController {
    @Autowired
	private CourseService cs;
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ArrayList<String> al=cs.getCourses();
		return new ModelAndView("Show","AL",al);
	}

}
