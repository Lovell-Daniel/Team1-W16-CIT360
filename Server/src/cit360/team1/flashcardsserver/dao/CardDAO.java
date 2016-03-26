package cit360.team1.flashcardsserver.dao;

import java.util.Collections;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

import cit360.team1.flashcardsserver.FlashcardsServer;
import cit360.team1.flashcardsserver.model.Card;

public class CardDAO{
	
	//creating a new record using a transaction...
	public void createCard(Card card)  throws Exception{ 
	    //creating session object  
	    Session session = FlashcardsServer.getHibernateUtil().openSession();
	      
	    //creating transaction object  
	    Transaction t = session.beginTransaction();  
	    session.persist(card);//persisting the object  
	    
	    t.commit();//transaction is committed  
	    
	    if(session != null && session.isOpen())
			session.close();
	}
	
	//updating a record in 
	public void updateCard(Card card)  throws Exception{
		//creating session object  
	    Session session = FlashcardsServer.getHibernateUtil().openSession();

	    session.saveOrUpdate(card);//persisting the object  
	    
	    session.flush();
	    
	    if(session != null && session.isOpen())
			session.close();
	}

	//deleting a person record
	public void deleteCard(int cardId)  throws Exception{
		//creating session object  
	    Session session = FlashcardsServer.getHibernateUtil().openSession();
	      
	    Card card = new Card();
	    card.setCardId(cardId);
	    session.delete(card);//persisting the object  
	    
	    session.flush();
	    
	    if(session != null && session.isOpen())
			session.close(); 
	}
	
	public Card getCard(int cardId)  throws Exception{
		//creating session object  
	    Session session = FlashcardsServer.getHibernateUtil().openSession();
		
		Card card = null;
		card = session.load(Card.class, cardId);
		Hibernate.initialize(card);
		
		if(session != null && session.isOpen())
			session.close();
		
		return card;
	}
	
	public List<Card> getCards()  throws Exception{
		Session session = FlashcardsServer.getHibernateUtil().openSession();
		
		//Collections.checkedList ensures that only objects of type Card.class are added to the generic List.
		@SuppressWarnings("unchecked")
		List<Card> cards = Collections.checkedList(session.createCriteria(Card.class).addOrder(Order.asc("cardId")).list(), Card.class);

		return cards;
	}
}
