
package com.pranav.demo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Team t = new Team (4,"Delhi Capitals(W)");
//		Configuration cfg = new Configuration();
//	cfg.configure("config.xml");
//	SessionFactory factory = cfg.buildSessionFactory();
//	Session session = factory.openSession();
	
	Session ses=new Configuration().configure("config.xml").buildSessionFactory().openSession();
	Transaction tr = ses.beginTransaction();

	Team ref = ses.load(Team.class,3); // load() method is equivalent to select query
	System.out.println(ref.getTeamName());
	ref.setTeamName("Gujarat Lions (W)");
	ses.delete(ref);
	tr.commit();
	ses.close();
	
		}

}
