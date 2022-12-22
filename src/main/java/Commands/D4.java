package Commands;

import Logic.Randomiser;
import org.example.Command;

public class D4 extends Command {
    public D4() {
        super("d4");
    }

    @Override
    public String execute() {
        return Randomiser.getRandomInteger(4) + "";
    }
}
