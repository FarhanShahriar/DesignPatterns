import java.util.HashMap;
import java.util.Map;

public class Stock {
    private final Map<String, Observer> subscribers = new HashMap<>();

    public void subscribe(String name, Observer subscriber) {
        subscribers.put(name, subscriber);
    }

    public void unsubscribe(String name) {
        subscribers.remove(name);
    }

    public void sendNotification(int amount) {
        subscribers.values().forEach(subscriber -> subscriber.doNotify(amount));
    }
}
