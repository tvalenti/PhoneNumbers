// Imports the entire swing library
import javax.swing.*;
// class identifier
public class PhoneNumbers
{
    // Main shell that executes the the application
   public static void main(String[] args)
   {
        // Two parallel arrays. one stores the names and one stores the phone numbers that match the names.
       String[] names = new String[30];
       names[0] = "Gina";    
       names[1] = "Marcia";
       names[2] = "Rita";    
       names[3] = "Jennifer";
       names[4] = "Fred";    
       names[5] = "Neil";
       names[6] = "Judy";    
       names[7] = "Arlene";
       names[8] = "LaWanda"; 
       names[9] = "Deepak";
       String[] numbers = new String[30];
       numbers[0] = "(847) 341-0912";
       numbers[1] = "(847) 341-2392";
       numbers[2] = "(847) 354-0654";
       numbers[3] = "(414) 234-0912";
       numbers[4] = "(414) 435-6567";
       numbers[5] = "(608) 123-0904";
       numbers[6] = "(608) 435-0434";
       numbers[7] = "(608) 123-0312";
       numbers[8] = "(920) 787-9813";
       numbers[9] = "(930) 412-0991";

       // Declares two String variables
       String entryName, entryPhone;
        // Declares an int variable for counter
       int x;
        // Initialized a boolean variable to false for an if statement
       boolean isFound = false;
        // Initializes a variable for a starting point to enter new names and numbers into the arrays
       int highest = 10;

        // Prompts user to enter a name and stores the response in entryName variable
       entryName = JOptionPane.showInputDialog(null, "Enter name to look up. Type 'quit' to quit.");

        // While highest is less than 30 and entryName does not equal quit do block below
       while (highest < 30 && !entryName.equals("quit"))
       { 
            // For x being zero and is less than highest, increment x by 1
          for(x = 0; x < highest; ++x)
            // If entryName equals (ignoring case of upper or lower) the name of the index of x in names array
             if(entryName.equalsIgnoreCase(names[x]))
             {
                // If its found as to be equal then sets isFound to true shows user the number that matches the name they entered and increases x to the value of highest to end the for loop only after the user clicks ok on dialog window.
                isFound = true;
                JOptionPane.showMessageDialog(null, names[x] + "'s phone number is " + numbers[x]);
                x = highest;
             }
            // If isfound is not equal to true then it does block below
          if(!isFound)
          {
              // Prompts user to enter the phone number of the name they searched for prior and stores it in entryPhone variable
             entryPhone = JOptionPane.showInputDialog(null, "Enter phone number for " + entryName);
            // After user enters the number for the name they previously search it is entered into the arrays as the next index
             names[highest] = entryName;
             numbers[highest] = entryPhone;
            // The index number is incremented by 1 and making it now 11 after the first iteration so a new name and number can be entered in the next index
             ++highest;
          }
            // Prompts user to enter a name or quit the program
          entryName = JOptionPane.showInputDialog(null, "Enter name to look up. Type 'quit' to quit.");
            // isFound returned back to false in case the name was found
          isFound = false;
      }
   }
}
   