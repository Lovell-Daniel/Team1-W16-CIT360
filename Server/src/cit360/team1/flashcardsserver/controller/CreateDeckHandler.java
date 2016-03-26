package cit360.team1.flashcardsserver.controller;

import org.json.JSONObject;

import cit360.team1.flashcardsserver.model.Deck;
import cit360.team1.flashcardsserver.dao.DeckDAO;

public class CreateDeckHandler extends Handler {

	@Override
	String handleIt(JSONObject data) {
		
		System.out.println("Create Deck Stub");
		
		//Create deck 
		Deck deck = new Deck();
		deck.setDeckName(data.getString("deckName"));
		
		//use DeckDAO to persist in database
		DeckDAO pd = new DeckDAO();
	    try{
	    	pd.createDeck(deck);
	    	System.out.println("successfully saved");
	    }
	    catch(Exception e){
	    	String errMsg = "There was a problem saving this deck record [CREATEDECK]: " + e.getMessage();
	    	System.out.println(errMsg);
	    }		
		return "";
	}

}
