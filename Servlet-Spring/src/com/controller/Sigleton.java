package com.controller;

public final class Sigleton {
  int a=10;
  private static Sigleton  sg=null;
	private Sigleton()
	{
		System.out.println("object created");
	}
	
	 public static Sigleton getInstance()

	 {
		if(sg==null)
		{
			sg=new Sigleton();
		}
		 return sg;
	 } 
		 
		 public static void main(String[] args) {
	 
		// TODO Auto-generated method stub
		Sigleton s=Sigleton.getInstance();
		
		System.out.println(s);
		
		Sigleton s1=Sigleton.getInstance();
		System.out.println(s1);
		
		
		Sigleton s2=Sigleton.getInstance();
		System.out.println(s2);
		
	}

}
