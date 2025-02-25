package edu.guilford;

public class CardGameDriver {
    public static void main(String[] args) {
        final int NGAMES = 10000; // Define the number of games to simulate
        final int NUMBER_OF_PLAYERS = 4; // Example number of players
        ThirtyOneGame game = new ThirtyOneGame(NUMBER_OF_PLAYERS);
        
        for (int i = 0; i < NGAMES; i++) {
            game.playGame(); // Play the game
        }

        System.out.println("Game has started with " + NUMBER_OF_PLAYERS + " players.");
    }
}
