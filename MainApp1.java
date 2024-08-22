package com.pranav.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Session ses=new Configuration().configure("config.xml").buildSessionFactory().openSession();
	Transaction tr = ses.beginTransaction();

	Team ref = ses.load(Team.class,3); // load() method is equivalent to select query
	// Here this Team.class is a template(structure) and not the oobject.
	//This is done to tell the hibernate to convert the database data into specific type of object.
	System.out.println(ref.getTeamName());
	ref.setTeamName("Chennai Superkings (W)");
	
	tr.commit();
	ses.close();
	
		}

}
