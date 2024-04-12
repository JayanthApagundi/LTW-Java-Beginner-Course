public class inbuiltMath {
    public static void main(String[] args) {

        // Math.abs() method returns the absolute value of a number.
        int v=Math.abs(-5);
        System.out.println(v); // 5
        System.out.println(Math.abs(-10.5)); // 10.5

        // Math.ceil() method returns the smallest integer that is greater than or equal to the argument.
        System.out.println(Math.ceil(10.5)); // 11.0

        // Math.floor() method returns the largest integer that is less than or equal to the argument.
        System.out.println(Math.floor(10.5)); // 10.0

        // Math.max() method returns the larger of two arguments.
        System.out.println(Math.max(10, 20)); // 20

        // Math.min() method returns the smaller of two arguments.
        System.out.println(Math.min(10, 20)); // 10

        // Math.pow() method returns the value of the first argument raised to the power of the second argument.
        System.out.println(Math.pow(2, 3)); // 8.0

        // Math.sqrt() method returns the square root of a number.
        System.out.println(Math.sqrt(16)); // 4.0

        // Math.random() method returns a random number
        int randomNum = (int)(Math.random() * 10);  // 0 to 10
        System.out.println(randomNum);

        double randomDoubleNum=Math.random() * 10;
        System.out.println(randomDoubleNum);
    }
}