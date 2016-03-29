package cit360.team1.flashcardsserver.controller;

import org.json.JSONObject;

import cit360.team1.flashcardsserver.dao.DeckDAO;
import cit360.team1.flashcardsserver.model.Deck;

public class CreateDeckHandler extends Handler {

	@Override
	String handleIt(JSONObject data) {
				
		//Create deck 
		Deck deck = new Deck();
		deck.setDeckName(data.getString("deckName"));
		
		//use deck to persist in database
		DeckDAO deckDao = new DeckDAO();
		try {
			deckDao.createDeck(deck);
			return "TRUE";

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return e.getMessage();
		}
		
		
	}

}
