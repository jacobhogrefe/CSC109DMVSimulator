import java.util.Random;

public class DMVSimulator {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Welcome to the DMV! The happiest place on Earth!");
        int userNumber = rand.ints(1, 1, 100).findFirst().getAsInt();
        System.out.println("Your number is " + userNumber + ".");
        int currentNumber = userNumber + 1;
        while (currentNumber != userNumber) {
            if (currentNumber == 100) {
                currentNumber = 1;
            }
            System.out.println("Serving number " + currentNumber + ".");
            currentNumber++;
        }
        System.out.println("Serving number " + userNumber + ".");
        System.out.println("Sorry, you don't have the proper paperwork.");
    }
}