import Actions.Command;

import java.util.LinkedList;
import java.util.Queue;

public class Invoker implements Runnable{
    private boolean invoke = true;
    private final Queue<Command> commands = new LinkedList<>();

    private boolean isInvokerOn() {
        return invoke;
    }

    public void stopInvoking() {
        this.invoke = false;
    }

    public void setCommand(Command command) {
        this.commands.add(command);
    }

    @Override
    public void run() {
        System.out.println("invoking started");
        while(!commands.isEmpty() || isInvokerOn()) {
            Command command = commands.poll();
            if (command != null) command.execute();
        }
        System.out.println("invoking finished");
    }
}
