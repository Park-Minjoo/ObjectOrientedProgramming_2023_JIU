public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(555550000);
        Time t3 = new Time(5, 23, 55);

        System.out.println("Time 1: " + t1.getHour() + ":" + t1.getMinute() + ":" + t1.getSecond());
        System.out.println("Time 2: " + t2.getHour() + ":" + t2.getMinute() + ":" + t2.getSecond());
        System.out.println("Time 3: " + t3.getHour() + ":" + t3.getMinute() + ":" + t3.getSecond());

        t1.setTime(555550000);
        System.out.println("Time 1 (after setTime): " + t1.getHour() + ":" + t1.getMinute() + ":" + t1.getSecond());
    }
}
