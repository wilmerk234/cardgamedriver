package edu.guilford;

import java.util.ArrayList;
import java.util.List;

public class ThirtyOneGame {
    private List<Player> players;
    private Deck deck;
    private Hand stockpile;
    private Hand discardPile;
    private int currentPlayerIndex;

    public ThirtyOneGame(int numberOfPlayers) {
        players = new ArrayList<>();
        deck = new Deck();
        stockpile = new Hand();
        discardPile = new Hand();
        currentPlayerIndex = 0;

        // Initialize players
        for (int i = 0; i < numberOfPlayers; i++) {
            players.add(new Player("Player " + (i + 1)));
        }

        deck.shuffle();
        dealInitialCards();
    }

    private void dealInitialCards() {
        for (Player player : players) {
            for (int i = 0; i < 3; i++) {
                player.addCard(deck.deal());
            }
        }
    }

    public void playGame() {
        deal(); // Deal cards at the start of the game
        boolean gameWon = false;

        while (!gameWon) {
            Player currentPlayer = players.get(currentPlayerIndex);
            // Implement turn logic for the current player
            // Check for win conditions, update currentPlayerIndex, etc.
            currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
            // Additional game logic will go here
        }
    }
    
    
    
    public void deal() {
        // Deal cards to players at the start of the game
        for (Player player : players) {
            for (int i = 0; i < 3; i++) {
                player.addCard(deck.deal());
            }
        }
    }
    }
