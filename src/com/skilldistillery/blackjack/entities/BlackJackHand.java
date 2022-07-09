package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public class BlackJackHand extends Hand {

	private List<Card> cards = new ArrayList<Card>();

	public BlackJackHand() {
	}

	public void addCard(Card card) {
		cards.add(card);
	}

	public int getHandValue() {
		int value = 0;
		for (Card card : cards) {
			value += card.getValue();
		}

		return value;
	}

}
