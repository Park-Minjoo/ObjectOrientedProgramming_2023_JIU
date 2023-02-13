import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str;
        System.out.print("Please enter a String: ");
        str = in.next();

        int digit = 0;
        for(int i = 0; i < str.length(); i++)
        {
            switch (str.toUpperCase().charAt(i))
            {
                case 'A': case 'B': case 'C': digit = 2; break;
                case 'D': case 'E': case 'F': digit = 3; break;
                case 'G': case 'H': case 'I': digit = 4; break;
                case 'J': case 'K': case 'L': digit = 5; break;
                case 'M': case 'N': case 'O': digit = 6; break;
                case 'P': case 'Q': case 'R': case 'S': digit = 7; break;
                case 'T': case 'U': case 'V': digit = 8; break;
                case 'W': case 'X': case 'Y': case 'Z': digit = 9; break;
            }
            System.out.print(digit);
        }
        System.out.println();
    }
}
