package Commands;

import Logic.Randomiser;
import org.example.Command;

public class D20 extends Command {
    public D20() {
        super("d20");
    }

    @Override
    public String execute() {
        return Randomiser.getRandomInteger(20) + "";
    }
}
