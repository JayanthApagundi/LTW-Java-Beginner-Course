public class Loops {
    public static void main(String[] args) {

        // while, do-while and For
        int i=5;
        while(i>0){
            System.out.println(i);
            i--;
        }

        // do-while: Execute the do-while block atleast once irrespective of the condition.
        int j=0;
        do{
            System.out.println(j);
            j--;
        }while(j>0);

        int k;
        for(k=0;k<10;k++){
            System.out.println(k);
        }

        // While or Do-While: When we do not know how many iterations to be executed
        // For: When we know how many iterations to be done (RANGE)

    }
}