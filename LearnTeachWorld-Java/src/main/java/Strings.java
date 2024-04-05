public class Strings {
    public static void main(String[] args) {

        String thought="Honesty is the best policy";

        //Find the length of Strings
        int x=thought.length();
        System.out.println(x);

        //Convert strings to upper case or lower case
        System.out.println(thought.toUpperCase());
        System.out.println(thought.toLowerCase());

        //To find index or position of char or word
        System.out.println(thought.indexOf("s"));
        System.out.println(thought.indexOf("Z")); //-1
        System.out.println(thought.indexOf("policy"));

        //Concatenate Strings
        String first_name="John";
        String last_name="Molson";
        System.out.println(first_name+last_name);
        System.out.println(first_name.concat(last_name));
        System.out.println(first_name.concat("Doe"));

        int p = 10;
        int q = 20;
        int z = p + q;
        System.out.println(z); //30

        String c = "10";
        int d = 20;
        String e = c + d;
        System.out.println(e); //1020

        String f = "10";
        String g = "20";
        String h = f + g;
        System.out.println(h); //1020

        // charAt(number) -> Gives the character present at that index/position
        System.out.println(thought.charAt(0));
        System.out.println(thought.charAt(24));
        //System.out.println(thought.charAt(75));

        // Replace- If string provided not present then it will give us actual string output and does not throw any errors
        System.out.println(thought.replace("the","a"));
        System.out.println(thought.replace("bun","ret"));

        //Splits- ComeBack

    }
}