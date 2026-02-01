import java.util.Scanner; // We use the Scanner class from java.util to handle user input
public class PrintPattern2 {
    public static void main(String[] args){
    //take an input
    Scanner in = new  Scanner(System.in);
    System.out.print("Enter the size: ");
    int size = in.nextInt();

    //dealing with invalid inputs
    boolean possible = true;
    if (size > 5){
        System.out.println("too big!");
        possible = false;
    } else if (size < 1){
        System.out.println("too small!");
        possible = false;
    }
    

    //logic
    if (possible){
        int midpoint = (size*2)/2;  //intentionally doing integer division
        int max = size;
        int min = 1;
        for (int row = 1; row <= size*2; row++){
            //for each row print the first half going from min to max, then other half going from max to min
            for (int i = min; i <= max; i++){
                System.out.print(i);
            }
            for (int j = max; j >= min; j--){
                System.out.print(j);
            }
            
            //change the values ready for the next row
            if (row < midpoint){
                max += 1;
                min += 1;
            } else if (row > midpoint){
                max -= 1;
                min -= 1;
            }

            System.out.println();
        }
        System.out.println();
    }
    //for each row, the max will increase by one if the previous row is less than midpoint,
    // stay the same if its midpoint,
    //decrease if previous row is greater than midpoint
    // min will follow whatever max does
    
    }
}
