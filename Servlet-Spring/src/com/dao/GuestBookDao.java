package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pojo.GuestbookEntry;



public class GuestBookDao {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public GuestbookEntry insertUser(GuestbookEntry u)
	{
		System.out.println("Inside Insertuser.....");
		 Session session=sessionFactory.openSession();
		 Transaction tx=session.beginTransaction();
		 
		 session.save(u);
		 System.out.println("u...."+u.getGcomment());
		 tx.commit();
		 return u;
		
	}
}
