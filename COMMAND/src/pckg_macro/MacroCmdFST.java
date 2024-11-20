package pckg_macro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MacroCmdFST implements Command {
    private final ArrayList<Command> commands = new ArrayList<>();

    public MacroCmdFST(ArrayList<Command> commands) {
        this.commands.addAll(commands);
    }

    @Override
    public void run() {
        if (commands.isEmpty()) {
            System.out.println("No commands to run");
            return;
        } else {
            for (Command command : commands) {
                command.run();
            }
        }
    }

    @Override
    public void undo() {
        Collections.reverse(commands);
        for (Command command : commands) {
            command.undo();
        }
        Collections.reverse(commands);
    }

}