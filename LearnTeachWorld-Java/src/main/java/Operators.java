public class Operators{
    public static void main(String[] args) {
        //Arthrimatic operators
        int x=8, y=10;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(y/x);
        System.out.println(y%x); //Modulo- Gives remainder

        //Post-increment
        int z=x+1;
        int a=x++;
        System.out.println(z);
        System.out.println(a);

        //Pre-increment
        int l=x+1;
        int b=++x;
        System.out.println(l);
        System.out.println(b);

        //Assignment Operator
        y=y+5;
        y+=5;
        z*=5;
        System.out.println(y);
        System.out.println(z);

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
        System.out.println(~a);
        System.out.println(~b);
    }
}