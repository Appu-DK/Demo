package com.jspiders.hibernate.TestCase1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
	{

		Person p=new Person();
		p.setPersonName("david");
		p.setPersonId(101);
		p.setPersonPhone(8232l);

		Pan pan=new Pan();
		pan.setAddress("bangalore");
		pan.setName("king");
		pan.setPanNo(223);

		p.setpanUniueID(pan);

		Configuration cfg=new Configuration().configure().addAnnotatedClass(Person.class)
				.addAnnotatedClass(Pan.class);

		SessionFactory sf=cfg.buildSessionFactory();
		Session session = sf.openSession();
		session.save(p);
		session.save(pan);


		Transaction trans = session.beginTransaction();
		trans.commit();
		session.close();

	}
}
