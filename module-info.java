import java.util.Scanner;

 public class guess    
   {
    public static void GuessingGame()   //GuessingGame is function
    {
       
        Scanner in = new Scanner(System.in); //Scanner class.
 
        int number = 1 + (int)(100 * Math.random()); // Generate the numbers using pre-existing function random() in java.

        /*Math.random() function generates a number between 0(inclusive) to 1(exclusive) and multiplied by 100 to convert demical value to a whole number.
          The whole number should be of int type(type conversion) because variable is of int type.
          +1 is because we are taking numbers from 1-100 */
 
         int K = 5; // No. of chances that are given to user to guess the number.
 
        int i, guess;
 
        System.out.println("\n" + " A number is chosen " + " between 1 to 100."+ "\n" + " Guess the number "  + " within 5 trials. ");
           
        for (i = 0; i < K; i++) {  // To keep track of chances.
 
            System.out.println("\n" +" Guess the number: ");
 
             guess = in.nextInt(); // Taking input from the user.
 
             if (number == guess) //Checking whether the guessed number is equal to the random number.
             {
                System.out.println("\n" +  "Congratulations!"    + " You guessed the number.");
                 
                break;
                   
            }
            else if (number > guess && i != K - 1)   //i!=k-1 because k varies from 0 to 4 when k=4 that is the last chance and it should not give the hint to the user.
                    {
                      System.out.println( "\n"+ "The number is "  + "greater than " + guess);
                   
                    }
            else if (number < guess && i != K - 1)  //i!=k-1 because k varies from 0 to 4 when k=4 that is the last chance and it should not give the hint to the user.
                 {
                System.out.println("\n"+ "The number is"   + " less than " + guess);
                   
                 }
        } 
 
        if (i == K) // For loop exhausted.
        {
            System.out.println("\n"+" You have exhausted"   + " K trials.");
            
            System.out.println("\n"+ "The number was " + number);
               
        }
    } //Function GuessingGame closes.
 
   
    public static void main(String arg[])  //Main Function.
    {
     GuessingGame(); // Function calling.
    }
}