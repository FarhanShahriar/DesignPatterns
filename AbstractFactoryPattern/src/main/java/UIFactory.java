import Interfaces.Platform;
import Mac.MacPlatform;
import Windows.WindowsPlatform;

public class UIFactory {
    Platform createPlatform(int platformType) {
        if (platformType == 1) return new WindowsPlatform();
        else if (platformType == 2) return new MacPlatform();
        return null;
    }
}
