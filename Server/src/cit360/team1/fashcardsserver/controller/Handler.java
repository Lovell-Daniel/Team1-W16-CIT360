package cit360.team1.fashcardsserver.controller;

import org.json.JSONObject;

public abstract class Handler {
	abstract String handleIt(JSONObject data);
}