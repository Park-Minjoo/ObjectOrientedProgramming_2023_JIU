package Assignment;

public abstract class Predator extends Animal11 {
    private static int LEG_COUNT = 4;

    public static int speed() {
        return LEG_COUNT * 30;
    }

    public abstract String getFood();

    public void printFood() {
        System.out.println(getFood());
    }
}

