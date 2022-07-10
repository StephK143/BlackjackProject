package com.skilldistillery.blackjack.entities;

public enum Suit {

	HEARTS("\u2665"), SPADES("\u2660"), CLUBS("\u2663"), DIAMONDS("\u2666");

	private String name;

	Suit() {
	}

	Suit(String suit) {
		this.name = suit;

	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
