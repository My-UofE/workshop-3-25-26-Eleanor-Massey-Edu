import java.util.Scanner; // We use the Scanner class from java.util to handle user input
public class PrintPattern1 {
    public static void main(String[] args){
    //take an input
    Scanner in = new  Scanner(System.in);
    System.out.print("Enter the size: ");
    int size = in.nextInt();

    //logic
    for (int row = 1; row <= size; row++){
        for (int column = 1; column <= row; column++){
            System.out.print(column);
        }
        System.out.println();
    }
    }
}
