package cit360.team1.flashcardsserver.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import cit360.team1.flashcardsserver.dao.DeckDAO;
import cit360.team1.flashcardsserver.model.Deck;

public class GetDecksHandler extends Handler {

	@Override
	String handleIt(JSONObject data) {
		
		DeckDAO deckDao = new DeckDAO();
		
		try {
			List<Deck> decks = deckDao.getDecks();
			Iterator<Deck> iter = decks.iterator();
			ArrayList<String> deckList = new ArrayList<>();
			while (iter.hasNext()) {
				Deck deck = (Deck) iter.next();
				deckList.add(deck.getDeckName());
			}
			JSONArray jsonDecks = new JSONArray(deckList);
			
			return jsonDecks.toString();
			/*
			List<Deck> decks = deckDao.getDecks();
			Iterator<Deck> iter = decks.iterator();
			HashMap<Integer, String> deckMap = new HashMap<>();
			while (iter.hasNext()) {
				Deck deck = (Deck) iter.next();
				deckMap.put(deck.getDeckId(), deck.getDeckName());
			}			
			
			JSONObject jsonDecks = new JSONObject(deckMap);
			
			return jsonDecks.toString();
			*/

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return e.getMessage();
		}
		
	}

}
