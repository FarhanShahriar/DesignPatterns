package Mac;

import Interfaces.Button;
import Interfaces.CheckBox;
import Interfaces.Platform;
import Interfaces.TextBox;

public class MacPlatform implements Platform {
    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MacTextBox();
    }
}
