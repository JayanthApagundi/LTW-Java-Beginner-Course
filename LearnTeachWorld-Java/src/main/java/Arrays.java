// Arrays: Collection of data which are of similiar type

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        // Declaration
        // Syntax: dataType var = new dataType[size]
        int[] a=new int[5];
        a[0]=9;
        a[1]=10;
        a[2]=8;
        a[3]=19;
        a[4]=45;
        // You can replace the values at the same location
        a[0]=89;
        for(int i=0;i<5;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();

        // Initialization and Declaration
        int[] b={4,5,6,7,8,9};
        for(int i=0;i<6;i++){
            System.out.print(b[i]+ " ");
        }
        System.out.println();

        String[] names=new String[5];
        names[0]="John";
        names[1]="Mike";
        names[2]="Karl";
        names[3]="Paul";
        names[4]="Jake";

        for (int i = 0; i < 5; i++) {
            System.out.print(names[i]+ " ");
        }
        System.out.println();

        String[] games={"FootBall", "Cricket", "Hockey"};
        for (int i = 0; i < 3; i++) {
            System.out.print(games[i]+ " ");
        }
        System.out.println();

        int[] array= new int[5];
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 5 values");
        //array[0]=input.nextInt();
        //array[1]=input.nextInt();
        //array[2]=input.nextInt();
        //array[3]=input.nextInt();
        //array[4]=input.nextInt();

        for (int i = 0; i < 5; i++) {
            array[i]=input.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println();

        //double[] p= new double[5];


    }
}