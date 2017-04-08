import java.util.Date;

/**
 * Создано Ашамазом Шомаховым
 */
public class Timer extends Thread{


    Date begin = new Date();
volatile public static int timeInSec;
    @Override
    public void run() {
      while(true){

      synchronized (this)
      { Date now = new Date();
          timeInSec = (int)((now.getTime()-begin.getTime())/1000);
        notifyAll();

      }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }
}
