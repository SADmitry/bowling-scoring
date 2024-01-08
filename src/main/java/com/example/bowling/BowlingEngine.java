package com.example.bowling;

public class BowlingEngine {
    /**
     * @param rolls is a flat array of rolls for calling simplicity and potential extern to other languages
     *              Spare is represented as 2 rolls in frame, 10 in sum
     *              See tests for use case examples
     * @return score of the game
     */
    public int score(int[] rolls) {
        int score = 0;
        int frameIndex = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (isStrike(frameIndex, rolls)) {
                score += 10 + strikeBonus(frameIndex, rolls);
                frameIndex++;
                // Third roll only in frame 10
                if (frameIndex == rolls.length - 1) {
                    score += rolls[frameIndex];
                }
            } else if (isSpare(frameIndex, rolls)) {
                score += 10 + spareBonus(frameIndex, rolls);
                frameIndex += 2;
            } else {
                score += sumOfBallsInFrame(frameIndex, rolls);
                frameIndex += 2;
            }
        }
        return score;
    }

    private int sumOfBallsInFrame(int frameIndex, int[] rolls) {
        return rolls[frameIndex] + rolls[frameIndex + 1];
    }

    private int strikeBonus(int frameIndex, int[] rolls) {
        // case for frame 10 strikes
        if (frameIndex == rolls.length - 2) {
            return rolls[frameIndex + 1];
        }
        return rolls[frameIndex + 1] + rolls[frameIndex + 2];
    }

    private int spareBonus(int frameIndex, int[] rolls) {
        return rolls[frameIndex + 2];
    }

    private boolean isSpare(int frameIndex, int[] rolls) {
        return rolls[frameIndex] + rolls[frameIndex + 1] == 10;
    }

    private boolean isStrike(int frameIndex, int[] rolls) {
        return rolls[frameIndex] == 10;
    }
}
