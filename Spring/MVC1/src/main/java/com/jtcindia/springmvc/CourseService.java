package com.jtcindia.springmvc;

import java.util.ArrayList;

public class CourseService {
public ArrayList<String> getCourses(){
ArrayList<String> Al=new ArrayList<String>();
Al.add("JAVA");
Al.add("JDBC");
Al.add("servlets");
Al.add("jsp");
Al.add("struts");
Al.add("JSF");

return Al;	
}
	

}
