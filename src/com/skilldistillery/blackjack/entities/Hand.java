package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	private List<Card> cards = new ArrayList<>();

	public Hand() {

	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public void dealOneCard(Card card) {
		cards.add(card);
	}

	public String showOneCard() {
		String hiddenCard = "Hidden card " + cards.get(0).toString();
		return hiddenCard;
	}

	public abstract int getHandValue();

	@Override
	public String toString() {
		String displayCards = "" + cards.toString();
		return displayCards;
	}

}
