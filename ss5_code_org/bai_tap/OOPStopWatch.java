package ss5;

import java.time.LocalTime;

public class OOPStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        //thuật toán
        for(int i = 0; i< 100000; i++) {
            int a = 5;
            a+=10;
        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}
