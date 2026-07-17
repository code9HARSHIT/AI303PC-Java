import java.util.Scanner;
class prog1{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        IO.println("Enter a number :");
        int x = s.nextInt();
        IO.println("Enter a number :");
        int y = s.nextInt();
        var v = x/y;
        System.out.println(v);


    }
}