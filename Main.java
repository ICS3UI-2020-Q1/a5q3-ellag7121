import java.util.Scanner; 
/**
 * ask user for a number, then, tell the user the factoral of that number
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner
    Scanner input = new Scanner(System.in);

    //initialize variables
    int number; //the number provided by the user
    int product; //the accumulator variable that will store the product of itself and the current value of "i" in the for loop

    //ask user for a number
    System.out.println("Please enter an integer to calculate the factorial of");
    number = input.nextInt();

    //set the product variable to the value of number
    product = number; //this is so we can change the product variable without altering the number we originally entered

    //start the loop that will count down from the given number
    for(int i = number - 1; i >= 1; i--){ //i starts as 1 less than the given number so that we don't multiply the number by itself at the start
      //multiply the current total by the value of "i"
      product *= i;
    }

    //tell the user what the factoral of their number is
    System.out.println(number + "! = " + product);
  }
}
