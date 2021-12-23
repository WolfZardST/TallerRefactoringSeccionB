
package choices;

public class Scissors extends Choice {

    @Override
    public Choice enfrentarA(Choice choice) {
        if(choice instanceof Rock) return choice;
        if(choice instanceof Paper) return this;
        return null;
    }
    
    @Override
    public String toString() {
        return "Scissors";
    }
    
}
