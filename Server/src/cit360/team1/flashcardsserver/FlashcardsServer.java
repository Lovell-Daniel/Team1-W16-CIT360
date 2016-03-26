package cit360.team1.flashcardsserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.SessionFactory;

import cit360.team1.flashcardsserver.controller.Controller;
import cit360.team1.flashcardsserver.dao.DeckDAO;
import cit360.team1.flashcardsserver.model.Card;
import cit360.team1.flashcardsserver.model.Deck;
import cit360.team1.flashcardsserver.util.HibernateUtil;

public class FlashcardsServer {
	
	public static SessionFactory getHibernateUtil() throws Exception{
		return HibernateUtil.getSessionFactory();
	}

	public static void main(String[] args) {
		boolean quitServer = false;
		while(!quitServer) {
			try (ServerSocket serverSocket = new ServerSocket(4499);){
				try {
					System.out.println("Server accepting new connections.");
					Socket clientSocket = serverSocket.accept();
					System.out.println("Client connected from: "+clientSocket.getInetAddress());
					Controller communication = new Controller(clientSocket);
					new Thread(communication).start();
				} catch (IOException e){
					System.out.println("\n**ERROR** There was a problem connecting with client.");
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			} catch (IOException e) {
				System.out.println("\n**ERROR** There was a problem starting the server.");
				System.out.println(e.getMessage());
				e.printStackTrace();
				quitServer = true;
			}
		}
	}
}
