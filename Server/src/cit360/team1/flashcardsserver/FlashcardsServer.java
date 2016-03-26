package cit360.team1.flashcardsserver;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.SessionFactory;
import cit360.team1.flashcardsserver.dao.DeckDAO;
import cit360.team1.flashcardsserver.model.Card;
import cit360.team1.flashcardsserver.model.Deck;
import cit360.team1.flashcardsserver.util.HibernateUtil;

public class FlashcardsServer {
	
	public static SessionFactory getHibernateUtil() throws Exception{
		return HibernateUtil.getSessionFactory();
	}

	public static void main(String[] args) {
		//start server	
		//debug code for hibernate
		//use DeckDAO to persist in database
		DeckDAO pd = new DeckDAO();
		Deck deck = new Deck();
		Card card = null;
		deck.setDeckName("Physics 101 Cards");
		
		//create cards set
		Set<Card> cards = new HashSet<Card>();
		
		
		card = new Card();
		card.setCardTitle("Card P101 - 1");
		card.setSideOne("This is side one");
		card.setSideTwo("This is side two");
		card.setReadFlag(false);
		cards.add(card);
		
		card = new Card();
		card.setCardTitle("Card P101 - 2");
		card.setSideOne("This is side one");
		card.setSideTwo("This is side two");
		card.setReadFlag(false);
		cards.add(card);
		
		card = new Card();
		card.setCardTitle("Card P101 - 3");
		card.setSideOne("This is side one");
		card.setSideTwo("This is side two");
		card.setReadFlag(false);
		cards.add(card);
		
		card = new Card();
		card.setCardTitle("Card P101 - 4");
		card.setSideOne("This is side one");
		card.setSideTwo("This is side two");
		card.setReadFlag(false);
		cards.add(card);
		
		deck.setCards(cards);		
		
	    try{
	    	pd.createDeck(deck);
	    	System.out.println("successfully saved");
	    }
	    catch(Exception e){
	    	String errMsg = "There was a problem saving this deck record [CREATEDECK]: " + e.getMessage();
	    	System.out.println(errMsg);
	    }		
	}
}
