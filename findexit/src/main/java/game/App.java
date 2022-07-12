package game;

import java.util.Scanner;

import javax.swing.text.PlainDocument;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        // create a new player and a new map
        Character dave = new Human("programmer", "dave");
        Map map = new Map(10, 10, dave);

        // use this as the condition for the while loop
        boolean win = false;
        while (!win) {


            // ask the player for the direction they would like to move in
            System.out.println("Please a direction your would like to move in [N,S,W,E]:");
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            
            // put the result of the move into the win variable. If the move returns true, it means the player is on the exit and has therefore won
            win = map.move(s);    
            
            // print the players current location
            System.out.println("You position is at X: "+ map.player.getX() + " Y: "+map.player.getY());

        }

        System.out.println("You win");
    }
}
