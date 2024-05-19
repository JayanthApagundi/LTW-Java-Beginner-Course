public class Operators{
    public static void main(String[] args) {
        //Arithmetic operators
        int x=8, y=10;
        System.out.println("ADD: "+ (x+y));
        System.out.println("SUB: "+(x-y));
        System.out.println("MUL:"+(x*y));
        System.out.println("DIV: " + (y/x));
        System.out.println("MODULO:"+ (y%x)); //Modulo- Gives remainder

        // x++, y++
        //Post-increment
        System.out.println("Post Increment");
        int z=x+1;
        int a=x++;
        System.out.println(x);
        System.out.println(z);
        System.out.println(a);

        //Pre-increment
        // --x,++y
        System.out.println("Pre Increment");
        int l=x-1;
        int b=--x;
        System.out.println(x);
        System.out.println(l);
        System.out.println(b);
        System.out.println("-----------------------------------");

        //Assignment Operator
        y=y+5;
        y+=5;
        y*=5;
        System.out.println(y);
        System.out.println(y);

        //Comparison Operators
        int p=10,q=25;
        System.out.println(p>q);
        System.out.println(p<q);
        System.out.println(p<=q);
        System.out.println(p>=q);
        System.out.println(p==q);
        System.out.println(p!=q);

        //Logical Operators
        //AND,OR, NOT
        int c=10,d=20;
        System.out.println(p>c && d<q);
        System.out.println(d<q || c<p);
        System.out.println(!(d<q));

        //Bitwise Operators
        //AND- &, OR- |, XOR- ^, COMPLIMENT- ~(tilde)
        int i=5; //101
        int j=7; //111

        System.out.println(i&j);
        System.out.println(i|j);
        System.out.println(i^j);
        // COMPLIMENT(~) it will convert all 32-bit 0's to 1's as well.
        //System.out.println(~a);
        System.out.println(~b);

        //Assignment Operators
        y = y+5; // y = 10 + 5
        y+=5;  // y = 15 + 5
        // 8
        x=x*10; // 80
        x*=10;  // 800
        System.out.println(y); // 20
        System.out.println(x); // 800

    }
}