import java.util.Scanner;
public class Functions{
    // Function Declaration
    public static void maxReturnsNothing(int a,int b){
        // Body of the Function
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }
        else{
            System.out.println(b+" is greater than "+a);
        }
    }

    // Function Definition- Return
    public static int maxReturnsInt(int a,int b){
        // Body of the Function
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter the first number: ");
        a = input.nextInt();
        System.out.println("Enter the second number: ");
        b = input.nextInt();
        int result=maxReturnsInt(a,b); // Function Call
        System.out.println("The maximum number is: "+result);

        int c,d;
        System.out.println("Enter the first number: ");
        c = input.nextInt();
        System.out.println("Enter the second number: ");
        d = input.nextInt();
        maxReturnsNothing(a,b); // Function Call


    }
}