import java.util.Scanner;

public class UserInterface {
    private Scanner scan;
    
    
    /**
     * Displays a welcome message to the user.
     */
    public void welcome() {
        System.out.println("Welcome to the Weather-matic 3000!\n\n");
        
        System.out.println("This application will provide you weather forecasts"
                + " for multiple locations, \rfrom multiple weather services.\n");
        
        System.out.println("You can maintain a 'Location List' of your favorite places "
                + "and get a single \rweather forecast report for all your locations in one report.\n");

    }
    
    /**
     * Prompts the user to select if they would like to use an existing 'Location List',
     * create a new list, or edit an existing list.
     * 
     * While Loop used to continue prompting until a valid response it provided.
     */
    public void selection() {
        System.out.println("\nDo you have an existing 'Location List' you would like to use? "
                + "\rIf not we can build a new one! You may also edit an existing Location List.\n");
        System.out.print("If you have an existing Location List, type 'Y'.  "
                + "\rOtherwise, enter 'N' for New or 'E' to Edit: ");
        
        scan = new Scanner(System.in);
        String initSelection = scan.next();
        
        int validCheck = 0; // Variable used to continue looping until valid response received.
        
        while (validCheck == 0) {
            if (initSelection.toLowerCase().equals("y")) {
                System.out.println("Selected 'Y'");
                validCheck = 1; // switched to '1' to exit while loop
                
                // GO TO: use existing Location List method
                
            } else if (initSelection.toLowerCase().equals("n")) {
                System.out.println("Selected 'N' for New");
                validCheck = 1; // switched to '1' to exit while loop
                
                // GO TO: create new Location List method

            } else if (initSelection.toLowerCase().equals("e")) {
                System.out.println("Selected 'E' for Edit");
                validCheck = 1; // switched to '1' to exit while loop
                
                // GO TO: edit existing Location List method

            } else {
                
                /*
                 * If a valid response is not received, the value of 'validCheck' 
                 * remains 0, and the While Loop continues to loop until a 
                 * valid response is received 
                 */
                System.out.println("\nThat is not a valid selection. Please try again!!");
                System.out.print("Enter 'Y' to use existing 'Location List', 'N' to create a new list, or 'E' to edit your list: ");
                initSelection = scan.next();
            }
        }
    }
    
    /**
     * Method to handle when user input is to use an existing Location List
     */
    public void useExisting() {
        
    }
    
    /**
     * Method to handle when user input is to create a new Location List
     */
    public void createNewList() {
        
    }
    
    
    
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.welcome();
        ui.selection();
    }

}
