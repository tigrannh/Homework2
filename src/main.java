public class main {
    public static void main(String[] args) {
        //some examples
        int a = 12, b = 8;
        System.out.println("a + b =" + (a + b));
        System.out.println("a - b =" + (a - b));
        System.out.println("a * b =" + (a * b));
        System.out.println("a / b =" + (a / b));
        System.out.println("a % b =" + (a % b));
        System.out.println("++a =" + ( ++a ));
        System.out.println("b++ =" + ( b++ ));
        System.out.println("a =" + a + "  b = " + b);
        System.out.println("a == b is " + (a == b ));
        System.out.println("a != b is " + (a != b ));
        System.out.println("a > b is " + (a > b ));
        System.out.println("a <= b is " + (a <= b ));
        System.out.println("a > b && a!=b  is " + (a>b && a!=b));
        System.out.println("a > b || a!=b  is " + (a>b || a!=b));
        System.out.println("!(a != b)  is " + (!(a!=b)));
        System.out.println("a & b =" + (a & b));
        System.out.println("a | b =" + (a | b));
        System.out.println("a ^ b =" + (a ^ b));
        System.out.println("~b =" + (~b));
        System.out.println("a << b =" + (a << b));
        System.out.println("a >> b =" + (a >> b));
        System.out.println("a >>> b =" + (a >>> b));

        b += a;
        a -= 2;
        System.out.println("a =" + a + "  b = " + b);

        int[] Array = new int[]{2,4,5};
        System.out.println(" Array[1] =" + Array[1]);
        Array[1] -= 2;
        System.out.println(" Array[1] =" + Array[1]);

        if(Array[0] != Array[1])
            System.out.println("They aren't equal.");
        else
            System.out.println("They are equal.");

        double c = a>b?2.7:3.7;
        System.out.println("c= " + c);

    }
}
