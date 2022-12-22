package Commands;

import Logic.Randomiser;
import org.example.Command;

public class D8 extends Command {
    public D8() {
        super("d8");
    }

    @Override
    public String execute() {
        return Randomiser.getRandomInteger(8) + "";
    }
}
