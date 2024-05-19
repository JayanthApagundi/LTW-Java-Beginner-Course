public class GradeSwitch {
    public static void main(String[] args) {
        int score=95;
        score = score/10;
        // Use Switch
        switch(score){
            case 10:
                System.out.println("Grade: A+");
                break;
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
            case 6:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: F");
        }
    }
}