package Commands;

import Logic.Randomiser;
import org.example.Command;

public class D12 extends Command {
    public D12() {
        super("d12");
    }

    @Override
    public String execute() {
        return Randomiser.getRandomInteger(12) + "";
    }
}
