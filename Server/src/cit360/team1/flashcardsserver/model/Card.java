package cit360.team1.flashcardsserver.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

public class Card {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int card_id;
	
	@ManyToOne(fetch=FetchType.EAGER, targetEntity = Deck.class)
	private int deck_id;
	private String card_title;
	private String side_one;
	private String side_two;
	private Boolean read_flg;
	
	
	public int getCardId() {
		return card_id;
	}
	public void setCardId(int cardId) {
		this.card_id = cardId;
	}

	public int getDeckId() {
		return deck_id;
	}
	public void setDeckId(int deckId) {
		this.deck_id = deckId;
	}
	
	public String getCardTitle() {
		return card_title;
	}
	public void setCardTitle(String cardTitle) {
		this.card_title = cardTitle;
	}
	
	public String getSideOne() {
		return side_one;
	}
	public void setSideOne(String sideOne) {
		this.side_one = sideOne;
	}
	
	public String getSideTwo() {
		return side_two;
	}
	public void setSideTwo(String sideTwo) {
		this.side_two = sideTwo;
	}
	
	public Boolean getReadFlag(){
		return this.read_flg;
	}
	public void setReadFlag(Boolean readFlag){
		this.read_flg = readFlag;
	}
	@Override
	public String toString() {
		return "Card [card_id=" + card_id + ", deck_id=" + deck_id + ", card_title=" + card_title + ", side_one="
				+ side_one + ", side_two=" + side_two + ", read_flg=" + read_flg + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + card_id;
		result = prime * result + ((card_title == null) ? 0 : card_title.hashCode());
		result = prime * result + deck_id;
		result = prime * result + ((read_flg == null) ? 0 : read_flg.hashCode());
		result = prime * result + ((side_one == null) ? 0 : side_one.hashCode());
		result = prime * result + ((side_two == null) ? 0 : side_two.hashCode());
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
		Card other = (Card) obj;
		if (card_id != other.card_id)
			return false;
		if (card_title == null) {
			if (other.card_title != null)
				return false;
		} else if (!card_title.equals(other.card_title))
			return false;
		if (deck_id != other.deck_id)
			return false;
		if (read_flg == null) {
			if (other.read_flg != null)
				return false;
		} else if (!read_flg.equals(other.read_flg))
			return false;
		if (side_one == null) {
			if (other.side_one != null)
				return false;
		} else if (!side_one.equals(other.side_one))
			return false;
		if (side_two == null) {
			if (other.side_two != null)
				return false;
		} else if (!side_two.equals(other.side_two))
			return false;
		return true;
	}
	
	
}
