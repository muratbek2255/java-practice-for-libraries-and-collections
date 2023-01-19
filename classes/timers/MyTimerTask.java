package timers;

import java.util.Timer;

public class MyTimerTask {
    public void run() {
        System.out.println("Задание выполняется по таймеру");
    }
}


class TTest {
    public static void main(String[] args) {
        MyTimerTask myTask = new MyTimerTask();
        Timer myTimer = new Timer();

        myTimer.schedule(myTask, 1000, 500);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException exc) {}

        myTimer.cancel();
    }
}
