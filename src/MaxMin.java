import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        // Instance Variables
        Scanner s = new Scanner(System.in);
        int userInput;
        int min = 0;
        int max = 0;
        int total = 0;

        System.out.print("Enter a number (or -1 to quit): ");
        userInput = s.nextInt();

        if (userInput != -1)
        {
            min = userInput;
            max = userInput;
        }
        while (userInput != -1)
        {
            System.out.print("Enter a number (or -1 to quit): ");
            userInput = s.nextInt();
            if (userInput < min && userInput != -1)
            {
                min = userInput;
            }
            if (userInput > max)
            {
                max = userInput;
            }
            total++;
        }
        if (total == 0)
        {
            System.out.println("You did not enter any numbers!");
        }
        if (total > 0)
        {
            System.out.println("Max is: " + max);
            System.out.println("Min is: " + min);
        }
    }
}
