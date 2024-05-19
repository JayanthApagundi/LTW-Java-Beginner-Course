import java.util.Scanner;
public class Max3Numbers {
    public static void main(String[] args) {

        int a,b,c;

        Scanner input=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();

        int max;
        if(a>b && a>c){
            max=a;
        } else if(b>a && b>c){
            max=b;
        } else{
            max=c;
        }

        System.out.println("The maximum number is: "+max);
    }
}