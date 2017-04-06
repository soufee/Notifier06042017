/**
 * Created by Shoma on 06.04.2017.
 */
public class Messenger extends Thread{
   public int secondsForMes;
public Timer timer;
String string;
    public Messenger(int secondsForMes, Timer timer, String string) {
        this.secondsForMes = secondsForMes;
        this.timer = timer;
        this.string = string;

    }

    @Override
    public void run() {
while (true){
        synchronized (timer)
{
    try {
   int secondNow = timer.timeInSec;
    if (secondNow%secondsForMes==0 && secondNow != 0)
        System.out.println(secondNow+" "+string);

        timer.wait();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
    }}
}
