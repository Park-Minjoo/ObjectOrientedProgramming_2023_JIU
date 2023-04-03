public class AirConditionerMain {
    public static void main(String[] args) {
        AirConditioner A1 = new AirConditioner();
        A1.setTemperature(70);
        A1.setSpeed(2);
        A1.setOn(true);
        System.out.println(A1.toString());

        AirConditioner A2 = new AirConditioner();
        A2.setTemperature(68);
        A2.setOn(true);
        A2.setSpeed(3);
        A2.setOn(false);
        System.out.println(A2.toString());
    }
}
