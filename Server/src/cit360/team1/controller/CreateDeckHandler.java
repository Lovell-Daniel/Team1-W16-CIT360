package cit360.team1.controller;

import org.json.JSONObject;

import cit360.team1.model.Deck;

public class CreateDeckHandler extends Handler {

	@Override
	String handleIt(JSONObject data) {
		
		System.out.println("Create Deck Stub");
		
		//Create deck 
		Deck deck = new Deck();
		deck.setDeckName(data.getString("deckName"));
		
		//use deck to persist in database
		
		
		
		return "";
	}

}
