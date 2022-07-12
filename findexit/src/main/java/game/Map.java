package game;

import java.util.Random;

public class Map {

    Character player;
    int width;
    int length;
    int randomLocationX;
    int randomLocationY;

    public Map(int width, int length, Character player) {
        this.width = width;
        this.length = length;
        this.player = player;

        Random rnd = new Random(); 
        // generate a random location and place the player there
        this.randomLocationX = rnd.nextInt(width)+1;
        this.randomLocationY = rnd.nextInt(length) + 1;
        
        // generate a random location and place the exit their
        this.player.setX(rnd.nextInt(width) + 1);
        this.player.setY(rnd.nextInt(length) + 1);
    }

    public boolean checkExit() {
        // the user has reached the exit if the Y and X are both the same location as the randomLocationY and randomLocationX
        return this.player.getX() == this.randomLocationX && this.getPlayer().getY() == randomLocationY;
    }

    public boolean move(String direction) {

        // for each case
        // Check if moving in the given direction takes the player out of bounds
        switch (direction) {
            case "N":
                if (this.player.getY() + 1 <= this.getLength()) {
                    this.player.setY(this.player.getY() + 1);
                } else {
                    this.player.setY(1);
                }
                break;

            case "S":
                if (this.player.getY() - 1 >= 1) {
                    this.player.setY(this.player.getY() - 1);
                } else {
                    System.out.println("Invalid move");
                }
                break;
            case "W":
                if (this.player.getX() - 1 >= 1) {
                    this.player.setX(this.player.getX() - 1);
                } else {
                    System.out.println("Invalid move");
                }
                break;
            case "E":
                if (this.player.getX() + 1 <= this.getWidth()) {
                    this.player.setX(this.player.getX() + 1);
                } else {
                    this.player.setX(1);
                }
                break;
        }

        // now check if the user has reached the exit
        return checkExit();
    }

    public Character getPlayer() {
        return this.player;
    }

    public void setPlayer(Character player) {
        this.player = player;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

}
