import java.util.Scanner;

public class FamousQuotes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        String[] quotes = {
                "Your quote is: Believe in yourself.",
                "Your quote is: Every day is a fresh start.",
                "Your quote is: Dream big and work hard.",
                "Your quote is: Progress is better than perfection.",
                "Your quote is: Be the change you wish to see.",
                "Your quote is: Your only limit is your mind.",
                "Your quote is: Stay curious.",
                "Your quote is: Great things take time.",
                "Your quote is: Never stop learning.",
                "Your quote is: Make today count."
        };

        while (running) {

            try {
                System.out.print("Please enter a number 1-10: ");
                int num = scanner.nextInt();
                num--;

                System.out.println(quotes[num]);

            } catch (Exception e) {
                System.out.println("Your number was out of range.");
                scanner.nextLine();
                System.out.println("Please try again.");
            }

            System.out.print("Would you like another quote? (yes or no): ");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase("no")) {
                running = false;
            }
        }

        System.out.println("Thanks for visiting Famous Quotes!");

    }
}


