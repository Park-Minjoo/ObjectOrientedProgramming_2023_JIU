import java.util.Scanner;
import java.util.Random;
public class HeadsOrTails {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        Random random = new Random();
        int coin_flip = random.nextInt(2);

        System.out.print("Coin flip.  Enter 1 for heads, 0 for tails: ");
        int guess = in.nextInt();

        if(guess == coin_flip){
            System.out.println("Correct!");
        }else{
            System.out.println("Sorry, incorrect.");
        }


    }
}
