import java.util.Scanner;
public class RunningAverage {
    public static void main(String[] args) {
        // Instance Variables
        Scanner s = new Scanner(System.in);
        int total = 0;
        int userInput;
        int sum = 0;

        System.out.print("Enter a number (or -1 to quit): ");
        userInput = s.nextInt();
        if (userInput != -1)
        {
            total++;
            sum = userInput + sum;
        }

        while (userInput != -1)
        {
            System.out.print("Enter a number (or -1 to quit): ");
            userInput = s.nextInt();
            if (userInput != -1)
            {
                total++;
                sum = userInput + sum;
            }
        }

        if (total == 0)
        {
            System.out.println("You entered no numbers so nothing to show!");
        }
        else
        {
            System.out.println("Sum: " + sum);
            System.out.println("Number of numbers added: " + total);
            System.out.println("Average: " + (sum / total));
        }
    }
}
