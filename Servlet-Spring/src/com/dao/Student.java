package com.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Student {
private int sno;
private String question;
private Map<String,String>answers;
public int getSno() {
	return sno;
}
public void setSno(int sno) {
	this.sno = sno;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public Map<String, String> getAnswers() {
	return answers;
}
public void setAnswers(Map<String, String> answers) {
	this.answers = answers;
}

public void showanswers()
{
	Set<Entry<String, String>> set=answers.entrySet();
	Iterator<Entry<String, String>> itr=set.iterator();
	while(itr.hasNext())
	{
		Entry<String,String>  entry= itr.next();
		System.out.println(entry.getKey()+"   "+entry.getValue());
	}
}

}
