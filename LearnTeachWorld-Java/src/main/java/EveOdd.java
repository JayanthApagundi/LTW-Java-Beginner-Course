public class EveOdd {
    public static void main(String[] args) {
       // I need to check if the number is even or odd
         int[] numbers={2,3,4,5,6,7,8,9,10};
         for(int i=0;i<9;i++){
              if(numbers[i]%2==0){
                System.out.println(numbers[i]+" is even");
              }else{
                System.out.println(numbers[i]+" is odd");
              }
         }
    }
}