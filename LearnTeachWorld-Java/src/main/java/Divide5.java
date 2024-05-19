import java.util.Scanner;
//Problem Statement: Write a Java Program using functions to find if a given number is divisible by 5
public class Divide5{
    // This is function definition which has parameters (int f - Parameter/Argument)
//    public static void divide5(int f){
//        int mod;
//        mod=f%5;
//        if(mod==0){
//            System.out.println("The number "+f+" is divisible by 5!");
//        }
//        else{
//            System.out.println("The number "+f+" is not divisible by 5.");
//        }
//    }

    // Function which does not take any arguments
//    public static void divide5(){
//        int f;
//        Scanner input=new Scanner(System.in);
//        f=input.nextInt();
//        int mod;
//        mod=f%5;
//        if(mod==0){
//            System.out.println("The number "+f+" is divisible by 5!");
//        }
//        else{
//            System.out.println("The number "+f+" is not divisible by 5.");
//        }
//    }

    public static boolean divide5(){
        int f;
        Scanner input=new Scanner(System.in);
        f=input.nextInt();
        int mod;
        mod=f%5;
        if(mod==0){
            System.out.println("The number "+f+" is divisible by 5!");
            return true;
        }
        else{
            System.out.println("The number "+f+" is not divisible by 5.");
            return false;
        }
    }
    public static void main(String[] args){
//        Scanner input=new Scanner(System.in);
//        int f;
//        System.out.println("Enter a number to see if it is divisible by 5:");
//        f=input.nextInt();
        boolean result=divide5(); //Function call
        if(result==true){
            System.out.println("The number is divisible by 5!");
        }
        else{
            System.out.println("The number is not divisible by 5.");
        }
    }
}