
package game;

import choices.*;

public final class Round {
    
    private final Player p1;
    private final Player p2;
    private final Choice[] choices;
    int draw;

    public Round(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
        Choice[] arr = {new Paper(), new Rock(), new Scissors()}; 
        this.choices = arr;
        this.draw = 0;
    }
    
    /**
     * Randomly choose rock, paper or scissors
     * @return choice
     */
    public Choice getRandomChoice(){
        return choices[(int)(Math.random()*3)];
    }
    
    public void play() {
        
        p1.setChoice(getRandomChoice());
        p2.setChoice(getRandomChoice());
        
        RoundPrinter.print(this);
    }
    
    public Player chooseWinner() {
        
        Choice winnerChoice = p1.getChoice().enfrentarA(p2.getChoice());
        
        if(winnerChoice == p1.getChoice()){
            p1.addWin(); return p1;
        }
        if(winnerChoice == p2.getChoice()){
            p2.addWin(); return p2;
        }
        
        draw = 1;
        return null;
    }

    public Player getP1() {
        return p1;
    }

    public Player getP2() {
        return p2;
    }
    
    public int getDraw() { return draw; }
    
}
