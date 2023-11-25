package ss5;

import java.time.LocalTime;

public class StopWatch {
    private Long startTime;
    private Long endTime;

    public Long getStartTime() {
        return startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public StopWatch(){
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public Long getElapsedTime() {return this.endTime - this.startTime;
    }
}
