package Windows;

import Interfaces.Button;
import Interfaces.CheckBox;
import Interfaces.Platform;
import Interfaces.TextBox;

public class WindowsPlatform implements Platform {
    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextBox createTextBox() {
        return new WindowsTextBox();
    }
}
