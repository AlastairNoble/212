import java.util.InputMismatchException;
import java.util.Scanner;

public class IOHelper {

    private static Scanner screenInput = new Scanner(System.in);

    public static int getInt(int low, String prompt, int high) {
        int numFromUser = 0;
        String dummy;
        boolean numericEntryOK;
        do {
            System.out.print(prompt);
            numericEntryOK = false;
            try {
                numFromUser = screenInput.nextInt();
                screenInput.nextLine();
                numericEntryOK = true;
            } catch (InputMismatchException e) {
                dummy = screenInput.nextLine();
                System.out.println (dummy + " is not an integer!");
                numFromUser = low;
            } // end try-catch
            // Indicate to the user why he is being prompted again.
            if (numFromUser < low || numFromUser > high) {
                System.out.println("The number is outside the legal limits.");
            }
        } while (!numericEntryOK || numFromUser < low || numFromUser > high);
        return numFromUser;
    } // end full parameter getInt method

    
    public static String getString(String prompt) {
        String userText;
        System.out.print(prompt);
        userText = screenInput.nextLine();
        return userText;
    } // end one parameter getString method
    
}