import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int date = input.nextInt();

        String numberStr = null;
        switch (date) {
            case 0:  numberStr = "Sunday";    break;
            case 1:  numberStr = "Monday";    break;
            case 2:  numberStr = "Tuesday";   break;
            case 3:  numberStr = "Wednesday"; break;
            case 4:  numberStr = "Thursday";  break;
            case 5:  numberStr = "Friday";    break;
            case 6:  numberStr = "Saturday";  break;
            default: numberStr = "Not a valid day"; break;
        }
        System.out.println(numberStr);
    }

}
