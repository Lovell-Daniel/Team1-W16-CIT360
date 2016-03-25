package cit360.team1.controller;

import org.json.JSONObject;

public abstract class Handler {
	abstract String handleIt(JSONObject data);
}