
//Play the game with 2 Player. In this case if a Player gets a Ladder then plays again. Finally report which Player won the game
package com.bridgelabz;
import java.util.Random;
public class SnakeLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Simulator");
        System.out.println("The player starts from position zero");

        Random rnum = new Random();


        int diceRoll = 0, sum1 = 0, sum2 = 0, position = 0, options, pos = 0, timesDiceRoll = 0, turn = 0;
        int positionAgain = 0;

        String A = "", B = "";

        while (sum1 < 101 || sum2 < 101) {

            timesDiceRoll++;

            diceRoll = rnum.nextInt(6) + 1;

            options = rnum.nextInt(3);

            if (options == 0) {
                positionAgain += diceRoll;
                continue;
            } else if (options == 1)
                position = -diceRoll;
            else
                position = diceRoll;

            position += positionAgain;

            if (turn == 0) {

                sum1 += position;

                if (sum1 < 100)
                    pos = sum1;
                if (sum1 > 100)
                    sum1 = pos;
                if (sum1 == 100) {
                    A = "won";
                    break;
                }
                if (sum1 <= 0)
                    sum1 = 0;

            }

            if (turn == 1) {

                sum2 += position;

                if (sum2 < 100)
                    pos = sum2;

                if (sum2 > 100)
                    sum2 = pos;

                if (sum2 == 100) {
                    break;
                }
                if (sum2 <= 0)
                    sum2 = 0;

            }

            turn = turn ^ 1;
            positionAgain = 0;

            System.out.println("Current position of A and B in the game is : " + sum1 + " " + sum2);

        }

        System.out.println("A total of " + (timesDiceRoll * 2 - 1) + " times die has rolled to win the game");

        if (A == "won") {
            System.out.println("Player A has won the game");
        } else
            System.out.println("player B has won the game");
        int sum = 0, position = 0, options, diceRoll = 0;

  


    }
}
