package cit360.team1.flashcardsserver.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

public class Deck {
	private int deck_id;
	private String deck_name;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = Card.class)
	@JoinTable(name = "card", joinColumns = { @JoinColumn(name = "deck_id") }, inverseJoinColumns = { @JoinColumn(name = "deck_id") })
	private Set<Card> cards;
	
	public int getDeckId() {
		return deck_id;
	}
	public void setDeckId(int deckId) {
		this.deck_id = deckId;
	}
	public String getDeckName() {
		return deck_name;
	}
	public void setDeckName(String deckName) {
		this.deck_name = deckName;
	}
	
	public Set<Card> getCards() {
		return this.cards;
	}
	
	public void setCards(Set<Card> cards) {
		this.cards = cards;
	}

	@Override
	public String toString() {
		return "Deck [deckId=" + deck_id + ", deckName=" + deck_name + ", cards=" + cards + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cards == null) ? 0 : cards.hashCode());
		result = prime * result + deck_id;
		result = prime * result + ((deck_name == null) ? 0 : deck_name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deck other = (Deck) obj;
		if (cards == null) {
			if (other.cards != null)
				return false;
		} else if (!cards.equals(other.cards))
			return false;
		if (deck_id != other.deck_id)
			return false;
		if (deck_name == null) {
			if (other.deck_name != null)
				return false;
		} else if (!deck_name.equals(other.deck_name))
			return false;
		return true;
	}
}
