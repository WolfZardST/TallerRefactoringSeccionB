
package choices;

public class Rock extends Choice {

    @Override
    public Choice enfrentarA(Choice choice) {
        if(choice instanceof Paper) return choice;
        if(choice instanceof Scissors) return this;
        return null;
    }
    
}
