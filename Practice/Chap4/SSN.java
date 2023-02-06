import java.util.Scanner;

public class SSN {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a SSN: ");
        String ssn = in.next();

        for (int i = 0; i < ssn.length(); i++)
        {
            char ssnDigit = ssn.charAt(i);

            if (i == 3 || i == 6)
            {
                if (ssnDigit != '-')
                {
                    System.out.printf("%s is an invalid social security number%n", ssn);
                    System.exit(1);
                }
            }
            else
            {
                if (!Character.isDigit(ssnDigit))
                {
                    System.out.printf("%s is an invalid social security number%n", ssn);
                    System.exit(1);
                }
            }
        }

        System.out.printf("%s is a valid social security number.%n", ssn);
    }
}
