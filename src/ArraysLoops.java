public class ArraysLoops {
    public static void main(String[] args) {
        int[] a = new int[6];
        System.out.println(a[0]);
        a[0] = 4;
        a[1] = 74;
        a[3] = -7;
        a[4] = 1;
        a[5] = 1;
        System.out.println(a[0] + a[4]);
        System.out.println(a.length);
        System.out.println(a[0] + a[a.length - 1]);

        int[] array = {4, 1, -8, 0, 3, 4, 6};
        //int[] array = new int[7];
        //array[0] = 4;
        // ...
        //array[5] = 4;
        //array[6] = 6;
        System.out.println(array[0]);
        System.out.println(array.length - 1);
        // zangvac haytararelu evs 1 dzev`

        int x = 0;
        if (x > 0) {
            System.out.println("Positiv");


        } else {
            System.out.println("Non positive");
            int b;
            if (x > 0)
                b = 1;
            else
                b = 0;

        }
        int o = 20;
        int l = o > 20 ? 10 : 100;
        // x > 0 ? System.out.println("Positiv") : System.out.println("Non positiv");
        System.out.println(x > 0 ? "Positiv" : "Non positiv");
        x = -1;
        if (x > 0) {
            System.out.println("Positiv");


        } else {
            if (x < 0)
                System.out.println("Negative");
            else {
                System.out.println("Zero");
            }

        }
        x = 0;
        System.out.println(x > 0 ? "Positiv" : (x < 0 ? "Negative" : "Zero"));
        x = 6;
        switch (x) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Tree");
                break;
            default:
                System.out.println("Bigger");
        }
        System.out.println("--------------------");
        x = 5;
        switch (x) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Tree");
                break;
            case 4:
            case 5:
                System.out.println("Java");
                break;
            default:
                System.out.println("Bigger");

        }
        String y = "aa";
        switch (y) {
            case "aa":
                System.out.println("Gevorg");
                break;
            case "b":
                System.out.println("--------");
        }
        int counter = 1;
        while (counter < 11) {
            System.out.print(counter++ + "  ");
        }
        System.out.println(" ");
        System.out.println("----------------------------------------");

        x = 1;
        while (x <= 10) {
            System.out.println("Barev");
            x++;
        }
        System.out.println("--------------");
        x = 1;
        do {
            System.out.println("Barev");
            x++;
        } while (x <= 4);
        System.out.println("-----------");
        int c = 1;
        while (c <= 10) {
            System.out.print(c + " ");
            c++;
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------------");
        String[] names = {"Gevorg", "Hayk", "Lolo", "Mariam", "Karen"};
//        System.out.println(names[0]);
//        System.out.println(names[1]);
//        System.out.println(names[2]);
//        System.out.println(names[3]);
//        System.out.println(names[4]);
        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }
        System.out.println("------------------");
        for (String s : names) {
            System.out.println(s);
        }
        System.out.println("---------------");
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);

        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Gevorg");

        }
        int[] array2 = {4, 1, -8, -9, 2};
        for (int element : array2) {
            if (element < 0) {
                System.out.println("Ayo");
                break;
            }

        }
        for (int i = 1; i <= 10; i++) {
            if (i == 5)
                continue;
            System.out.println(i);
        }





    }
}

