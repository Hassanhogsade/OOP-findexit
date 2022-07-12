package game;

public class Human extends Character {
    String occupation;
    

    public Human(String occupation,String name) {
        super(name);
        this.occupation = occupation;
    }
    

    public String getOccupation() {
        return this.occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

}