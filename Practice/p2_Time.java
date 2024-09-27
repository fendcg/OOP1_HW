public class p2_Time {
    private int hour;
    private int minute;
    private int second;

    public p2_Time(int hour, int minute, int second) {
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
            System.out.println("Invalid time");
            return;
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandard() {
        String period;
        if (hour < 12) {
            period = "AM";
        } else {
            period = "PM";
        }
        int standardHour = hour % 12;
        if (standardHour == 0) {
            standardHour = 12;
        }

        return String.format("%02d:%02d:%02d %s", standardHour, minute, second, period);
    }

    public void add(p2_Time t) {
        this.second += t.second;
        this.minute += this.second / 60;
        this.second %= 60;

        this.minute += t.minute;
        this.hour += this.minute / 60;
        this.minute %= 60;
        this.hour += t.hour;
        this.hour %= 24;
    }

    public static void main(String[] args) {
        p2_Time t = new p2_Time(23,5,6);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());

        p2_Time t2 = new p2_Time(4, 24, 33);
        t.add(t2);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());
    }
}
