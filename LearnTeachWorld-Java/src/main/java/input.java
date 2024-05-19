import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a;
        System.out.println("Enter a number !!!");
        a = input.nextInt();
        System.out.println("Entered Number: "+a);

        String name;
        System.out.println("Enter your Name");
        name=input.next();
        System.out.println("The name entered: "+name);

        input.close();

    }
}