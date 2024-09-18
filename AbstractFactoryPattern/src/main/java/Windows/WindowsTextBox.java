package Windows;

import Interfaces.TextBox;

public class WindowsTextBox implements TextBox {
    @Override
    public void write(String name) {
        System.out.println("you wrote on windows textBox: " + name);
    }
}
