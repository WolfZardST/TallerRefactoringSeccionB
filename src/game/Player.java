
package game;

import choices.Choice;

public class Player{
    private int wins;
    private Choice choice;
    
    public Player() {
        this.wins = 0;
    }
    
    public void setChoice(Choice choice) {
        this.choice = choice;
    }

    public Choice getChoice() {
        return choice;
    }
    
    public void addWin() {
        wins++;
    }
    public int getWins() {
        return wins;
    }
}
