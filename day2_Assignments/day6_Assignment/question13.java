//: Knowledge Level from Score Range
//Define enum KnowledgeLevel with constants BEGINNER, ADVANCED, PROFESSIONAL, MASTER.
//Use a static method fromScore(int score) to return the appropriate enum:
//•	0–3 → BEGINNER, 4–6 → ADVANCED, 7–9 → PROFESSIONAL, 10 → MASTER.
//Then print the level and test boundary conditions.

package day6_Assignment;

enum KnowledgeLevel {
    BEGINNER, ADVANCED, PROFESSIONAL, MASTER;

    public static KnowledgeLevel fromScore(int score) {
        if (score >= 0 && score <= 3) {
            return BEGINNER;
        } else if (score >= 4 && score <= 6) {
            return ADVANCED;
        } else if (score >= 7 && score <= 9) {
            return PROFESSIONAL;
        } else if (score == 10) {
            return MASTER;
        } else {
            throw new IllegalArgumentException("Score out of range: " + score);
        }
    }
}

public class question13 {
    public static void main(String[] args) {
        int[] testScores = {0, 3, 4, 6, 7, 9, 10}; // Boundary cases

        for (int score : testScores) {
            KnowledgeLevel level = KnowledgeLevel.fromScore(score);
            System.out.println("Score: " + score + " → Level: " + level);
        }
    }
}

//Score: 0 → Level: BEGINNER
//Score: 3 → Level: BEGINNER
//Score: 4 → Level: ADVANCED
//Score: 6 → Level: ADVANCED
//Score: 7 → Level: PROFESSIONAL
//Score: 9 → Level: PROFESSIONAL
//Score: 10 → Level: MASTER
