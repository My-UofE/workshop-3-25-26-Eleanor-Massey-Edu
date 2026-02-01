import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class AverageSquares {
    public static void main(String[] args) {

        // Declare Scanner object
        Scanner in = new Scanner(System.in);

        // Prompt for input
        //System.out.print("Enter your name: ");

        // Read in line from standard input
        //String name = in.nextLine();

        //System.out.println("Hi " + name + "!");


        System.out.print("Please enter the start value: ");
        int startNum = in.nextInt(); // Reads in an int from standard input
        
        System.out.print("Please enter the end value: ");
        int endNum = in.nextInt();

        System.out.println("Average of squares from " + startNum + " to " + endNum + ":");

        //logic
        double total = 0;
        int i = startNum;
        do {
            total = total + i*i;
            i++;
        } while (i <= endNum);   //with a do while loop, it will do it the same number of times as a while loop, just it is guaranteed to do it the first time
            
        int n = endNum - startNum + 1;
        double average = total/n;
        System.out.println(average);
        System.out.println();
    } 
}