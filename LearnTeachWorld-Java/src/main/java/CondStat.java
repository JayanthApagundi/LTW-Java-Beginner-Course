public class CondStat {
    public static void main(String[] args) {
        int x = 40;
        int y = 60;

        // If single statement after if or else then no need of braces
        if (x > y) {
            System.out.println("Heyy ");
            System.out.println("x is greater than y");
        }
        else {
            System.out.println("Byee");
            System.out.println("y is greater than x");
        }

        // Not mandatory to have else block
        if(x<y){
            System.out.println("Hello World !!!");
        }

        System.out.println("Bye Bye !!!");

        // Nested if else
        int time = 15;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
    }
}