package cit360.team1.controller;

import java.util.HashMap;

public class HandlerMap {
	private HashMap<String, Handler> map = new HashMap<>();
	
	public HandlerMap() {
		
		//populate the map with messages for the server
		map.put("createDeck", new CreateDeckHandler());
		map.put("editDeck", new EditDeckHandler());
	}

	public Handler getHandler(String request) {
		return map.get(request);
	}
	
	public boolean isValidRequest(String request) {
		return map.containsKey(request);
	}
}
