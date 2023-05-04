package Assignment;

public class Tiger extends Predator implements Barkable {
    @Override
    public String getFood() {
        return "apple";
    }

    @Override
    public void bark() {
        System.out.println("growl");
    }
}
