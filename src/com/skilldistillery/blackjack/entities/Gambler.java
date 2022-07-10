package com.skilldistillery.blackjack.entities;

public class Gambler {
	BlackJackHand gamblerHand = new BlackJackHand();

	public void playBlackJack() {
	}

	public void addCard(Card card) {
		gamblerHand.addCard(card);

	}

	public Hand getHand() {
		return gamblerHand;
	}

}
