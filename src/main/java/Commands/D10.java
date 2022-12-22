package Commands;

import Logic.Randomiser;
import org.example.Command;

public class D10 extends Command {
    public D10() {
        super("d10");
    }
    @Override
    public String execute() {
        return Randomiser.getRandomInteger(10) + "";
    }
}
