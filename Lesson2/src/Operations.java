public class Operations {
    public static void main(String[] args) {
        int x1;
        int $x;
        int _x = 9;
        System.out.println(_x);
        int a45 = 92;
        System.out.println(a45);
        String firstName = "Gevorg";
        System.out.println(firstName);
        String firstNameOfTheBestStudent = "Gevorg";

        int a = 4;
        int b = 3;
        int c = a + b;
        System.out.println(c);
        int w = 5, v = 6;
        int o = v - w;
        System.out.println(o);
        System.out.println(a*b);
        int x = 7, y = 5;
        System.out.println(x/y);
        System.out.println(x%y);
        double t = 7.0, p = 5.0;
        System.out.println(t/p);
       x = 5;
       x++;
        System.out.println(x);
        x = 8;
        x = x + 1;
        ++x;
        System.out.println(x);
        x = 4;
        System.out.println(++x);
        System.out.println(x);
        x = 3;
        y = 4;
        c = x++ - --y; //
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("c = " + c);
        System.out.println("-----------");

        x = 7;
        y = 8;
        c = ++x + y--;//8 + 8, x = 8, c = 16, y = 7
        System.out.println(x++);// x = 8
        System.out.println(c);// c = 8 + 8 = 16
        System.out.println(x);// x = 9
        System.out.println(--y);//--y = 6
        System.out.println(y);//6

        boolean bb = x == 12;
        System.out.println(bb);
x = 10;
        System.out.println(x != 9);
        System.out.println(x != 19);
        System.out.println(x%2 == 0);
        x = 41;
        System.out.println(x >= 1 && x <= 9);
        boolean mm = x < 0 || x > 10;
        System.out.println(mm);
        System.out.println(!mm);
        System.out.println(5&8);
        System.out.println(5|8);
        System.out.println(5^8);
        System.out.println(17&24);
        x = 7;
        x = x + 2;
        System.out.println(x);
        x += 2;
        System.out.println(x);
        x = 17;
        x = x & 9;
        x &= 9;
        System.out.println(x);





    }
}
