//Difficulty Level & Game Setup
//Define enum Difficulty with EASY, MEDIUM, HARD.
//Write a Game class that takes a Difficulty and prints logic like:
//•	EASY → 3000 bullets, MEDIUM → 2000, HARD → 1000.
//Use a switch(diff) inside constructor or method.

package day6_Assignment;

enum Difficulty {
    EASY, MEDIUM, HARD
}

class Game {
    private int bullets;

    Game(Difficulty diff) {
        switch (diff) {
            case EASY:
                bullets = 3000;
                break;
            case MEDIUM:
                bullets = 2000;
                break;
            case HARD:
                bullets = 1000;
                break;
        }
        System.out.println("Difficulty: " + diff + " → Bullets: " + bullets);
    }
}

public class question11 {
    public static void main(String[] args) {
        new Game(Difficulty.EASY);
        new Game(Difficulty.MEDIUM);
        new Game(Difficulty.HARD);
    }
}

//Difficulty: EASY → Bullets: 3000
//Difficulty: MEDIUM → Bullets: 2000
//Difficulty: HARD → Bullets: 1000
