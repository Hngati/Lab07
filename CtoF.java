import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float celsius = 0, fahrenheit;
        boolean validInput = false;

        do {
            System.out.print("Please enter Temperature in Celsius: ");
            if (scan.hasNextFloat()) {
                celsius = scan.nextFloat();
                validInput = true;
            } else {
                System.out.println(" Error enter a valid number.");
                scan.nextLine(); // Clear the input buffer
            }
        } while (!validInput);

        if (celsius == 0) {
            System.out.println("Freezing point.");
        } else if (celsius == 100) {
            System.out.println("Boiling point.");
        } else {
            fahrenheit = celsius * 9 / 5 + 32;
            System.out.println("Temperature in Fahrenheits: " + fahrenheit);
        }

        scan.close();
    }
}
