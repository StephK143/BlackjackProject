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

	public void addCard(Card card) {
		cards.add(card);
	}

	public abstract int getHandValue();

	@Override
	public String toString() {
		String displayCards = ("" + getCards().toString());
		return displayCards;
	}

}
