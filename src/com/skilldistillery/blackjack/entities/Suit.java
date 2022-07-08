package com.skilldistillery.blackjack.entities;

public enum Suit {

	HEARTS("Hearts"), SPADES("Spades"), CLUBS("Clubs"), DIAMONDS("Diamonds");

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
