package cit360.team1.flashcardsserver.controller;

import java.util.HashMap;

public class HandlerMap {
	private HashMap<String, Handler> map = new HashMap<>();
	
	public HandlerMap() {
		
		//to create new fuctionality add a new entry with the desired request name
		//and the name of the new handler class. Then make sure the new handler
		//extends the Handler class. Then identify what data you need from the client
		//and what to return to the client, if anything. Then do everything in between.
		//This would normally include some kind of database access.
		
		//populate the map with messages for the server
		map.put("createDeck", new CreateDeckHandler());
		map.put("editDeck", new EditDeckHandler());
		map.put("getDecks", new GetDecksHandler());
	}

	public Handler getHandler(String request) {
		return map.get(request);
	}
	
	public boolean isValidRequest(String request) {
		return map.containsKey(request);
	}
}
