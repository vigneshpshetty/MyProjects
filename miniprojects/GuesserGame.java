package miniprojects;

import java.util.Scanner;

/**
 * GuesserGame
 */
class Speculator {
    int temp;

    int speculatorNum() {
        System.out.println("Kindly predict the number: ");
        Scanner sc = new Scanner(System.in);
        temp = sc.nextInt();
        return temp;
    }

}

class Guesser extends Speculator {

}

class Player extends Speculator {

}

public class GuesserGame {
    public static void main(String[] args) {
        Umpire umpire = new Umpire();
        umpire.colletNumberFromGusser();
        umpire.colletNumberFromPlayer();
        umpire.compute();
    }

}

class Umpire {

    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    int numFromGuesser;

    void colletNumberFromGusser() {
        Guesser g = new Guesser();
        numFromGuesser = g.speculatorNum();
    }

    void colletNumberFromPlayer() {
        Player p1 = new Player();
        numFromPlayer1 = p1.speculatorNum();

        Player p2 = new Player();
        numFromPlayer2 = p2.speculatorNum();

        Player p3 = new Player();
        numFromPlayer3 = p3.speculatorNum();

    }

    void compute() {
        if (numFromGuesser == numFromPlayer1)
            System.out.println("Player 1 won the game!!");
        else if (numFromGuesser == numFromPlayer2)
            System.out.println("Player 2 won the game!!");
        else if (numFromGuesser == numFromPlayer3)
            System.out.println("Player 3 won the game!!");
        else
            System.out.println("Game Lost! Try again...");
    }

}


/* Output
Kindly predict the number: 
100
Kindly predict the number: 
12
Kindly predict the number: 
45
Kindly predict the number: 
100
Player 3 won the game!!
    
 */