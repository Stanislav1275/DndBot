package Commands;

import Logic.Randomiser;
import org.example.Command;

public class D100 extends Command {
    public D100() {
        super("d100");
    }
    @Override
    public String execute() {
       return Randomiser.getRandomInteger(10)*10 + "";
    }
}
