package tickhour;

public class MyTime {

    private int hour;
    private int minute;
    private int second;
    private int meridian; // 0 as AM , 1 as NOON, 2 as PM, 3 as MIDNIGHT

    public MyTime(int hour, int minute, int seconds) {
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(seconds);
    }

    /* public myTime() {
        hour = 12;
        minute = 59;
        second = 57;
        meridian = 1;
    }*/
    public MyTime(int hour, int minute, int seconds, int meridian) {
        // 0 as AM , 1 as NOON, 2 as PM, 3 as MIDNIGHT
        this(hour, minute, seconds);
        this.meridian = meridian;

    }

    public void setHour(int hour) {
//        this.hour = hour > 24 && hour >= 0 ? hour : 0;
        int temp = this.hour + hour;
        if (temp > 24) {
            this.hour = temp - 24;
        } else {
            this.hour = temp;
        }
    }

    public void setMinute(int minute) {
        this.minute = minute < 60 && minute >= 0 ? minute : 0;
    }

    public void setSecond(int second) {
        this.second = second < 60 && second >= 0 ? second : 0;
    }

    public void setMeridian(int meridian) {
        this.meridian = meridian;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public int getMeridian() {
        return meridian;
    }

    public int getHour() {
        return hour;
    }

    public void displayTime24() {
        System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
    }

    public void tickBySecond() {
        int temp = this.second + 1;
        if (temp > 59) {
            this.minute = minute + 1;
            this.second = 0;
        } else {
            this.second = temp;
        }
    }

    public void tickBySecond(int seconds) {
        int temp = this.second + seconds;
        if (temp >= 60) {
            this.minute = minute + 1;
            this.second = temp - 60;
        } else {
            this.second = temp;
        }
    }

    public void tickByMinute() {
        if (this.minute == 59) {
            this.minute = 0;
            this.hour = hour + 1;
            if (this.hour + 1 > 24) {
                this.hour = 1;
                System.out.println("Tick by minute: " + this.hour);
            }
        } else {
            this.minute = minute + 1;
        }
    }

    public void tickByHour() {
        int temp = this.hour + 1;
        System.out.println("Hour: " + this.hour);
        System.out.println(hour);
        if (temp > 24) {
            this.hour = 1;
        } else {
            this.hour = temp;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d\n", hour, minute, second); //To change body of generated methods, choose Tools | Templates.
    }
}
