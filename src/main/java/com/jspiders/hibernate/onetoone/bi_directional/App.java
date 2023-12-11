package com.jspiders.hibernate.onetoone.bi_directional;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.xdevapi.SessionFactory;

public class App {
	public static void main(String[] args) {

		Customer customer=new Customer();
		customer.setCustomerContactNumber(323434l);
		customer.setCustomerId(205);
		customer.setCustomerName("james");

		Cart cart=new Cart();
		cart.setCartId(3344);
		
		cart.setCustomer(customer);
		customer.setCart(cart);

		Configuration cfg=new Configuration().configure().addAnnotatedClass(Cart.class)
		.addAnnotatedClass(Customer.class);
		org.hibernate.SessionFactory sf=cfg.buildSessionFactory();
		Session session = sf.openSession();

		session.save(cart);
		session.save(customer);

		Transaction trans = session.beginTransaction();
		trans.commit();
		session.close();
		
	}

}
