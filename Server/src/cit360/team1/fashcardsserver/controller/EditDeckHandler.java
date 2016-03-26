package cit360.team1.fashcardsserver.controller;

import org.json.JSONObject;

import cit360.team1.flashcardsserver.model.Deck;

public class EditDeckHandler extends Handler {

	@Override
	String handleIt(JSONObject data) {

		System.out.println("Edit Deck Handler Stub");
		
		//Fetch deck with Hibernate based on data.getString("currDeckName")
		//Deck deck = fetched deck
		//deck.setDeckName(data.getString("newDeckName"));
		
		//use deck to persist in database
		
		
		return "";
	}

}
