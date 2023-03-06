import java.util.Random;

public class DMVSimulator {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Welcome to the DMV! The happiest place on Earth!");
        int userNumber = rand.ints(1, 1, 200).findFirst().getAsInt();
        System.out.println("Your number is " + userNumber + ".");
        int currentNumber = userNumber + 1;
        while (currentNumber != userNumber) {
            if (currentNumber == 200) {
                currentNumber = 1;
            }
            System.out.println("Serving number " + currentNumber + ".");
            currentNumber++;
        }
        System.out.println("Serving number " + userNumber + ".");
        int miracleNumber = rand.ints(1, 1, 100).findFirst().getAsInt();
        if (miracleNumber == 69) {
            System.out.println("You have the correct paperwork. Congrats.");
        } else {
            System.out.println("You don't have the correct paperwork! You stupid, uneducated, little piece of garbage.");
        }
    }
}