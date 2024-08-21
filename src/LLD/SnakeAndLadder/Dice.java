package LLD.SnakeAndLadder;

import java.util.*;

public class Dice {
    int noOfDice;
    public static final int min = 1;
    public static final int max = 6;
    public Dice(int noOfDice) {
        this.noOfDice = noOfDice;
    }
    public int rollDice() {
        int total = 0;
        int currDice = 0;
        while(currDice < noOfDice) {
            Random random = new Random();
            total += random.nextInt(6) + 1;
            currDice ++;
        }
        return total;
    }
}
