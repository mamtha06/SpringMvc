package com.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.dao.Student;

public class StudenClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext context = new FileSystemXmlApplicationContext("/dispatcher-servlet.xml");
		 Resource r=new ClassPathResource("dispatcher-servlet.xml");  
	     BeanFactory factory=new XmlBeanFactory(r);  
		
		Student  st=(Student)factory.getBean("sc");
		st.setQuestion("what is spring");
		
		System.out.println(st.getQuestion());
		
		//System.out.println(st.getAnswers());
Student  st1=(Student)factory.getBean("sc");
		
		System.out.println(st1.getQuestion());
	}

}
