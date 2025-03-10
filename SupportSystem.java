import java.util.HashSet;
import java.util.Scanner;

/**
 * This class implements a technical support system. It is the top level class 
 * in this project. The support system communicates via text input/output 
 * in the text terminal.
 * 
 * This class uses an object of class InputReader to read input from the user,
 * and an object of class Responder to generate responses. It contains a loop
 * that repeatedly reads input and generates output until the users wants to 
 * leave.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class SupportSystem
{
    private InputReader reader;
    private Responder responder;
    
    /**
     * Creates a technical support system.
     */
    public SupportSystem()
    {
        reader = new InputReader();
        responder = new Responder();
    }

    /**
     * Start the technical support system. This will print a welcome
     * message and enter into a dialog with the user, until the user
     * ends the dialog.
     */
    
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Tech Support. Type your problem, or 'bye' to exit.");

        while (true) {
            System.out.print("> ");
            String inputLine = scanner.nextLine().trim().toLowerCase();
            if (inputLine.equals("bye")) {
                System.out.println("Goodbye!");
                break;
            }

            // Convert input into a set of words
            HashSet<String> words = new HashSet<>();
            for (String word : inputLine.split("\\s+")) {
                words.add(word);
            }

            // Get response
            String response = responder.generateResponse(words);
            System.out.println(response);
        }

        scanner.close();
    }


    /**
     * Print a welcome message to the screen.
     */
    private void printWelcome()
    {
        System.out.println("Welcome to the DodgySoft Technical Support System.");
        System.out.println();
        System.out.println("Please tell us about your problem.");
        System.out.println("We will assist you with any problem you might have.");
        System.out.println("Please type 'bye' to exit our system.");
    }

    /**
     * Print a good-bye message to the screen.
     */
    private void printGoodbye()
    {
        System.out.println("Nice talking to you. Bye...");
    }
}
