import java.util.Scanner;
public class ex1 {
    public static void main (String args []){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter some number: ");

        int input = in.nextInt();
        input = input % 360;
        System.out.println("Your input is: " + input);

    }
}
