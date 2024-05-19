import java.sql.SQLOutput;

public class StringsFunctions {
    public static void Greetings(String n,int a){
        int length=n.length();
        System.out.println("My name is "+n+" and My age is "+a+ " and length of name: "+length);
    }


    public static void main(String[] args) {

        String name="John";
        int age=10;
        Greetings(name,age);
    }
}