package Mac;

import Interfaces.TextBox;

public class MacTextBox implements TextBox {
    @Override
    public void write(String name) {
        System.out.println("you wrote mac textBox: " + name);
    }
}
