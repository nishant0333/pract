package com.jtcindia.servlet;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet implements SingleThreadModel {
	public TestServlet() {
		System.out.println("**testServlet Def Cons :"+this);
		
	}
	protected void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		String uname=req.getParameter("uname");
		Writer out=res.getWriter();
		out.flush();
		Thread th=Thread.currentThread();
		for(int i=0;i<10;i++) {
			System.out.println(th.getName()+"\t"+uname+"\t"+this);
			out.write("<br/>"+th.getName()+"\t"+this);
			try {
				Thread.sleep(100);
			}catch(Exception e) {
				e.printStackTrace();
			}
			out.write("<h1>Hi "+uname+"<br/>Response from Server");
		}
	}
}
