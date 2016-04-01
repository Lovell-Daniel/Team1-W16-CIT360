package cit360.team1.flashcardsserver.dao;

import java.util.Collections;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

import cit360.team1.flashcardsserver.FlashcardsServer;
import cit360.team1.flashcardsserver.model.Deck;

public class DeckDAO{
	
	//creating a new record using a transaction...
	public void createDeck(Deck deck)  throws Exception{ 
	    //creating session object  
	    Session session = FlashcardsServer.getHibernateUtil().openSession();
	      
	    //creating transaction object  
	    Transaction t = session.beginTransaction();  
	    session.persist(deck);//persisting the object  
	    
	    t.commit();//transaction is committed  
	    
	    if(session != null && session.isOpen())
			session.close();
	}
	
	//updating a record in 
	public void updateDeck(Deck deck)  throws Exception{
		//creating session object  
	    Session session = FlashcardsServer.getHibernateUtil().openSession();

	    session.saveOrUpdate(deck);//persisting the object  
	    
	    session.flush();
	    
	    if(session != null && session.isOpen())
			session.close();
	}

	//deleting a person record
	public void deleteDeck(int deckId)  throws Exception{
		//creating session object  
	    Session session = FlashcardsServer.getHibernateUtil().openSession();
	      
	    Deck deck = new Deck();
	    deck.setDeckId(deckId);
	    session.delete(deck);//persisting the object  
	    
	    session.flush();
	    
	    if(session != null && session.isOpen())
			session.close(); 
	}
	
	public Deck getDeck(int deckId)  throws Exception{
		//creating session object  
	    Session session = FlashcardsServer.getHibernateUtil().openSession();
		
		Deck deck = null;
		deck = session.load(Deck.class, deckId);
		Hibernate.initialize(deck);
		
		if(session != null && session.isOpen())
			session.close();
		
		return deck;
	}
	
	public List<Deck> getDecks()  throws Exception{
		Session session = FlashcardsServer.getHibernateUtil().openSession();
		
		//Collections.checkedList ensures that only objects of type Deck.class are added to the generic List.
		@SuppressWarnings("unchecked")
		List<Deck> decks = Collections.checkedList(session.createCriteria(Deck.class).addOrder(Order.asc("DeckId")).list(), Deck.class);

		return decks;
	}
}
