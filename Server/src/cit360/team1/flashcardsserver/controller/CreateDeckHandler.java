package cit360.team1.flashcardsserver.controller;

import org.json.JSONObject;

import cit360.team1.flashcardsserver.dao.DeckDAO;
import cit360.team1.flashcardsserver.model.Deck;

public class CreateDeckHandler extends Handler {

	@Override
	String handleIt(JSONObject data) throws Exception {
				
		//Create deck 
		Deck deck = new Deck();
		deck.setDeckName(data.getString("deckName"));
		
		//use deck to persist in database
		DeckDAO deckDao = new DeckDAO();
		deckDao.createDeck(deck);
		
		
		return "";
	}

}
