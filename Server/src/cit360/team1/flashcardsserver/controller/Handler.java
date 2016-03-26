package cit360.team1.flashcardsserver.controller;

import org.json.JSONObject;

public abstract class Handler {
	abstract String handleIt(JSONObject data) throws Exception;
}