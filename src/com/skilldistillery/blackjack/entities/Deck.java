package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards;

	public Deck() {
		cards = createDeck();
	}

	public List<Card> createDeck() {
		List<Card> deck = new ArrayList<>(52);

		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				deck.add(new Card(suit, rank));

			}
		}

		return deck;
	}

	public int checkDeckSize() {
		return cards.size();

	}

	public Card dealCard() {
		Card card = cards.remove(0);
		return card;
	}

	public void shuffle() {
		Collections.shuffle(cards);
		System.out.println("Cards are now shuffled");

	}
}
