/**
 * Created by Shoma on 06.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.start();

        Messenger messenger = new Messenger(1,timer,"");
        messenger.start();
        Messenger messenger5 = new Messenger(5,timer,"Каждые 5 секунд");
        messenger5.start();
        Messenger messenger7 = new Messenger(7,timer,"Каждые 7 секунд");
        messenger7.start();

    }
}
