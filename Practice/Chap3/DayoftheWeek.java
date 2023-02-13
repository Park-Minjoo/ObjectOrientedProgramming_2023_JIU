import java.util.Scanner;

public class DayoftheWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter today's date: ");
        int date = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = input.nextInt();

        int futureDate = (date + elapsed) % 7;
        String dayoftheWeek = "";

        switch(date){
            case 0: dayoftheWeek = "Sunday"; break;
            case 1: dayoftheWeek = "Monday"; break;
            case 2: dayoftheWeek = "Tuesday"; break;
            case 3: dayoftheWeek = "Wednesday"; break;
            case 4: dayoftheWeek = "Thursday"; break;
            case 5: dayoftheWeek = "Friday"; break;
            case 6: dayoftheWeek = "Saturday"; break;
        }

        if (futureDate == 0){
            System.out.printf("Todays is %s and the future day is Sunday", dayoftheWeek);
        }else if(futureDate == 1){
            System.out.printf("Todays is %s and the future day is Monday", dayoftheWeek);
        }else if(futureDate == 2){
            System.out.printf("Todays is %s and the future day is Tuesday", dayoftheWeek);
        }else if(futureDate == 3){
            System.out.printf("Todays is %s and the future day is Wednesday", dayoftheWeek);
        }else if(futureDate == 4){
            System.out.printf("Todays is %s and the future day is Thursday", dayoftheWeek);
        }else if(futureDate == 5){
            System.out.printf("Todays is %s and the future day is Friday", dayoftheWeek);
        }else if(futureDate == 6) {
            System.out.printf("Todays is %s and the future day is Saturday", dayoftheWeek);
        }
    }
}
