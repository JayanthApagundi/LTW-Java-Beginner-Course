import java.util.Scanner;

public class ArraySearch {
    public static int Search(int[] arr){
        int key;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the target element to search in array");
        key=input.nextInt();

        for (int i = 0; i < 10; i++) {
            if(arr[i]==key){
                System.out.println("Target Element " + key + " Found at " + i);
                return 1;
            }
        }

        System.out.println("Element not found !!!");
        return 0;
    }

    public static void main(String[] args) {

        int[] arr = new int[10];
        Scanner input=new Scanner(System.in);

        System.out.println("Enter 10 elements to be inserted in array");
        for (int i = 0; i < 10; i++) {
            arr[i]=input.nextInt();
        }

        while(true){
            if(Search(arr)==0){
                Search(arr);
            }else{
                break;
            }
        }
    }
}