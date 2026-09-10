package lab2;
import java.util.Scanner;
public class JaggedArray {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            IO.println("Enter the number of rows:");
            int row = s.nextInt();
            int[][] ja = new int[row][];
            
            
            
            for (int i = 0; i < ja.length; i++) {
                IO.println("Enter the number of columns for row " + (i + 1) + ":");
                int col = s.nextInt();
                ja[i] = new int[col];
                IO.println("Enter the elements for row " + (i + 1) + ":");
                for (int j = 0; j < col; j++) {
                    ja[i][j] = s.nextInt();
                }
                
            }
            
            for (int[] rowArr : ja) {
                for (int val : rowArr) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }   
    }
    
}

/*
    Sample output:

    Enter the number of rows:
    3
    Enter the number of columns for row 1:
    2
    Enter the elements for row 1:
    1 2
    Enter the number of columns for row 2:
    4
    Enter the elements for row 2:
    3 4 5 6
    Enter the number of columns for row 3:
    1
    Enter the elements for row 3:
    7
    
    1 2 
    3 4 5 6 
    7
*/
