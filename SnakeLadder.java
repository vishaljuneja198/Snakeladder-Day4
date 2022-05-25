//Ensure the player gets to exact winning position 100. - Note in case the player
package com.bridgelabz;

import java.util.Random;

public class SnakeLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Simulator");
        System.out.println("The player starts from position zero");

        Random rnum = new Random();

        int sum = 0, position = 0, options, pos = 0;

        while (sum < 101) {

            options = rnum.nextInt(3);
            int diceRoll = rnum.nextInt(6) + 1;

            switch (options) {

                case 0:
                    position = 0;
                    break;
                case 1:
                    position = -diceRoll;
                    break;
                case 2:
                    position = diceRoll;
                    break;

            }
            sum += position;
            if (sum < 100)
                pos = sum;

            if (sum > 100)
                sum = pos;

            if (sum == 100)
                break;

            if (sum <= 0)
                sum = 0;

        }
        System.out.println("Player has won after reaching top position : " + sum);
    }
}