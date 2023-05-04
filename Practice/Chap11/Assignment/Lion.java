package Assignment;

public class Lion extends Predator implements Barkable {
    @Override
    public String getFood() {
        return "banana";
    }

    @Override
    public void bark() {
        System.out.println("roar");
    }
}
