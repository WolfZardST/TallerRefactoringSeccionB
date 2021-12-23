
package choices;

public class Paper extends Choice {

    @Override
    public Choice enfrentarA(Choice choice) {
        if(choice instanceof Scissors) return choice;
        if(choice instanceof Rock) return this;
        return null;
    }
    
}
