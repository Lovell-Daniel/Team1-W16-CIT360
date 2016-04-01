package cit360.team1.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import org.json.JSONObject;

import cit360.team1.model.Deck;
import cit360.team1.view.HomeView;

public class HomeController {
	private HomeView homeView;
	private Deck homeModel;
	
	public HomeController(HomeView homeView, Deck homeModel){
		this.homeView = homeView;
		this.homeModel = homeModel;
		
		this.homeView.addNewDeckListener(new NewDeckListener());
	}
	
	class NewDeckListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			// Instantiate a new Deck
			Deck d = new Deck();
			d.setDeckName(homeView.getDeckName());
			JSONObject jsonObj = new JSONObject(d);
			String s = "{'request':'createDeck','data':"+jsonObj.toString()+"}";
			
			
			String hostname = "127.0.0.1";
			int port = 4499;
			
			try (
					Socket sock = new Socket(hostname, port);
					BufferedReader fromServer = new BufferedReader(new InputStreamReader(sock.getInputStream()));
					PrintWriter toServer = new PrintWriter(sock.getOutputStream(), true);
					//PrintWriter toServer = new PrintWriter(new OutputStreamWriter(sock.getOutputStream()));
				) {
				
				if (fromServer.readLine().startsWith("ready")) {
					toServer.println("ready");
					toServer.println(s);
					
					if (fromServer.readLine().startsWith("TRUE")) {
						homeView.displayErrorMessage("New Deck Created");
					}
					
				}
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		}
		
	}
	
}
