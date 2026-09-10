import java.util.Scanner;

public class Prog4 {
    public static void main(String[] args) {
        int[] x = new int[5];
        System.out.println("Enter the values:");
        Scanner s = new Scanner(System.in);
        for(int i=0;i<x.length;i++){
            x[i]=s.nextInt();
        }
       System.out.println("The values are: ");
        for(int v : x){
            System.out.print(v+" ");
        }
    }
    
}

/*
    Sample output:
    Enter the values:
    1
    2
    3
    4
    5
    The values are: 1 2 3 4 5
*/
