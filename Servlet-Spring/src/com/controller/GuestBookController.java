package com.controller;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;






import com.dao.GuestBookDao;
import com.pojo.GuestbookEntry;

@Controller
public class GuestBookController {
	private GuestBookDao gdao;
	
	public GuestBookDao getGdao() {
		return gdao;
	}

	public void setGdao(GuestBookDao gdao) {
		this.gdao = gdao;
	}

	@RequestMapping("/hello")
	public ModelAndView dispMessage(HttpServletRequest request,HttpServletResponse res)
	{
		String name=request.getParameter("name");
		 String message = "HELLO  welcome to my site "+name;  
	        return new ModelAndView("named", "message", message);  
	}

	@RequestMapping(value="/guestbook", method=RequestMethod.POST)
	public String registerUser(Map<String, Object> model)
	{  
		model.put("guestbook", new GuestbookEntry());
		return "guestBook";
	}
	
	@RequestMapping(value="/writeComment",method=RequestMethod.POST)
	public  String register(@Valid @ModelAttribute("guestbook")GuestbookEntry guestbook, BindingResult result,Model m)
	{  
		System.out.println("inside writeComment...");
		
		if (result.hasFieldErrors()) {
	            return "guestBook";
	        }
		guestbook.setDate(new Date());
		System.out.println(guestbook.getGcomment());
		System.out.println(guestbook.getDate());
		GuestbookEntry gb=gdao.insertUser(guestbook);
		System.out.println(gb.getGname());
		return "success";

	}
	
	
	@RequestMapping("/getoutput")
	public @ResponseBody int getoutput(HttpServletRequest request,HttpServletResponse res)
	{
		int s = 0;String s1=null;
		s1=request.getParameter("cals");
		
		int s2=Integer.parseInt(request.getParameter("num"));
		System.out.println(s1+s2);
		if(s1.equals("sqrt"))
				{
			
			 s=s2*s2;
			 System.out.println("inside add....."+s);
				}
		else if(s1.equals("cb"))
				{
			 s=s2*s2*s2;
			 System.out.println("inside cube....."+s);
				}
		return s;
				
			
			
		
	}
	


	
	
	
	
	
	
	
	
	
	@RequestMapping("/guestBook")
	public ModelAndView guestBook(HttpServletRequest request,HttpServletResponse res)
	{
		String name=request.getParameter("name");
		 String message = "HELLO  welcome to my site "+name;  
	        return new ModelAndView("named", "message", message);  
	}
	
}
