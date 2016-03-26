package cit360.team1.flashcardsserver;

import org.hibernate.SessionFactory;
import cit360.team1.flashcardsserver.util.HibernateUtil;

public class FlashcardsServer {
	
	public static SessionFactory getHibernateUtil() throws Exception{
		return HibernateUtil.getSessionFactory();
	}

	public static void main(String[] args) {
		//start server	
	}
}
