package Lab9.Task3;

public class WatchTimer {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public WatchTimer() {
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void end() {
        endTime = System.currentTimeMillis();
    }

    public long result() {
        long resultTime = endTime - startTime;
        return resultTime;
    }
}
