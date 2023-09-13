package enums;

import java.security.PublicKey;
import java.util.Random;

public class Game {

    private Random rand = new Random();

    public Result RockPaperScissors(RPS player) {
        int num = this.rand.nextInt(3);
        RPS cpu = null;
        if (num == 0) {
            cpu = RPS.ROCK;
        } else if (num == 1) {
            cpu = RPS.PAPER;
        } else cpu = RPS.SCISSORS;

        System.out.println("You called " + player);
        System.out.println("You it was " + cpu);

        if (cpu == player) {
            return Result.DRAW;
        } else if (player == RPS.ROCK) {
            if (cpu == RPS.SCISSORS) {
                return Result.WIN;
            } else {
                return Result.LOSE;
            }
        } else if (player == RPS.PAPER) {
            if (cpu == RPS.SCISSORS) {
                return Result.LOSE;
            } else {
                return Result.WIN;
            }

        } else if (player == RPS.SCISSORS) {
            if (cpu == RPS.PAPER) {
                return Result.WIN;
            } else {
                return Result.LOSE;
            }
        }
        return Result.LOSE;
    }
}

