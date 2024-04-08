import java.sql.SQLOutput;

/*
Variables- we use variables in order to store different kinds of data in it. It is a container that holds data to be used in the program
Data Types- data types are used to specify the type of data that a variable can hold.
 */
public class VarData {
    public static void main(String[] args) {
        // Primitive Data Types- int, char, double, float, boolean
        // Non-Primitive Data Types- String

        // Variables
        int a = 10; // Declaring variable and also initializing it
        double b = 20.5;
        char c = 'A';
        String d = "Hello World";
        boolean e = false;

        int x,y,z; // Declaration
        x=10;
        y=20;
        z=30;

        int p=10,q=20,r=30; // Declaration and Initialization

        // We want to assign 10 to any 3 variables
        int m,n,o; //Declaration of variables
        //m=10;
        //n=10;
        //o=10;
        // Multiple assignments in one line
        m=n=o=10;
        //10 10 10
        System.out.println(m+" "+n+" "+o);

        // Data Types
        System.out.println("Integer: " + a);
        System.out.println("Double: " + b);
        System.out.println("Character: " + c);
        System.out.println("String: " + d);
        System.out.println("Boolean: " + e);

        String name="John";
        int age=25;
        // John is 25 years old
        System.out.println(name + " is " + age + " years old");


        String first_name = "Sanjana";
        int $num=1000;

        // Demo on Case Sensitive
        int s=99;
        int S=100;
        System.out.println(s);
        System.out.println(S);


        /*
        General rules for variables
        Names can contain letters, digits, underscores, and dollar signs
        Names must begin with a letter
        Names should start with a lowercase letter, and cannot contain whitespace
        Names can also begin with $ and _ (but we will not use it in this tutorial)
        Names are case-sensitive ("myVar" and "myvar" are different variables)
        Reserved words (like Java keywords, such as int or boolean) cannot be used as names
         */

        char ch1='C';
        char ch2='D';
        System.out.println(ch1 + ch2);
        System.out.println(ch1 + " " + ch2);

    }
}