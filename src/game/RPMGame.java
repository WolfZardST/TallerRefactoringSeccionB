package game;
/*Simulate a game of Rock, Paper, Scissors*/

import java.util.LinkedList;
import java.util.List;

public class RPMGame {
    
    private final Player p1;
    private final Player p2;
    private final List<Round> rounds;
    private int draws;
    
    public RPMGame() {
        p1 = new Player();
        p2 = new Player();
        this.rounds = new LinkedList<>();
        draws = 0;
    }
    
    public void play() {
        
        printStatus();
        
        Round round = new Round(p1, p2);
        rounds.add(round);
        
        round.play();
        draws += round.getDraw();
        
        if(!isFinished()) play();
        else System.out.println("\nGAME WON\n");
    }
    
    private void printStatus() {
        System.out.println("\n***** Round: " +getRoundsPlayed() + " *********************\n");
        System.out.println("Number of Draws: "+draws + "\n");
    }
    
    public boolean isFinished(){
        return (p1.getWins()>=3)||(p2.getWins()>=3);
    }
    
    public int getRoundsPlayed() {
        return rounds.size();
    }
    
}


