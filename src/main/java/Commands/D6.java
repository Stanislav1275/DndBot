package Commands;

import Logic.Randomiser;
import org.example.Command;

public class D6 extends Command {
    public D6() {
        super("d6");
    }

    @Override
    public String execute() {
        return Randomiser.getRandomInteger(6) + "";
    }
}
