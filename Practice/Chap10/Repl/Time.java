package Repl;

import java.util.Date;

public class Time {
    private long hour;
    private long minute;
    private long second;

    public Time() {
        // Get the current time
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        second = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        minute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        hour = totalHours % 24;
    }

    public Time(long elapseTime) {
        // Set the time using the elapsed time
        Date date = new Date(elapseTime);
        hour = date.getHours();
        minute = date.getMinutes();
        second = date.getSeconds();
    }

    public Time(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    public void setTime(long elapseTime) {
        Date date = new Date(elapseTime);
        hour = date.getHours();
        minute = date.getMinutes();
        second = date.getSeconds();
    }
}
