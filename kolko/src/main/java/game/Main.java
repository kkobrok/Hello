package game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        NoughtsAndCrosses noughtsAndCrosses = new NoughtsAndCrosses(3);
        noughtsAndCrosses.clearTab();
        System.out.println("yo");
        noughtsAndCrosses.viewer();
        Player player1 = new Player('o');
        Player player2 = new Player('x');
        Scanner scanner = new Scanner(System.in);

        while(true){
            if (noughtsAndCrosses.placeSignOnTab(player1,scanner.nextInt(),scanner.nextInt()))
                    break;
            if (noughtsAndCrosses.placeSignOnTab(player2,scanner.nextInt(),scanner.nextInt()))
                    break;

        }


    }
}
