public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

// Домашнее Задание - 1

        int simple[] = new int[3];
        simple[0] = 1;
        simple[1] = 2;
        simple[2] = 3;
        for (int i = 0; i < simple.length; i++) {
            System.out.println(simple[i]);
        }


        double simple2[] = {1.57, 7.654, 9.986};
        for (int i = 0; i < simple2.length; i++) {
            System.out.println(simple2[i]);
        }

        int simple3[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        for (int i = 0; i < simple3.length; i++) {
            System.out.println(simple3[i]);
        }
        int a = simple3.length - 1;
        System.out.println(simple3[a]);

// Домашнее Задание - 2
        for (int i = 0; i < simple.length; i++) {
            if (i == simple.length - 1) {
                System.out.print(simple[i]);
            } else System.out.print(simple[i] + ",");
        }
        System.out.println();

        for (int i = 0; i < simple2.length; i++) {
            if (i == simple2.length - 1) {
                System.out.print(simple2[i]);
            } else System.out.print(simple2[i] + ",");
        }
        System.out.println();

        for (int i = 0; i < simple3.length; i++) {
            if (i == simple3.length - 1) {
                System.out.print(simple3[i]);
            } else System.out.print(simple3[i] + ",");
        }
        System.out.println();

// Домашнее задание 3
        for (int i = simple.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(simple[i]);
            } else System.out.print(simple[i] + ",");
        }
        System.out.println();

        for (int i = simple2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(simple2[i]);
            } else System.out.print(simple2[i] + ",");
        }
        System.out.println();

        for (int i = simple3.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(simple3[i]);
            } else System.out.print(simple3[i] + ",");
        }
        System.out.println();

// Домашнее задание 4
        for (int i = 0; i < simple.length; i++) {
            if (simple[i] % 2 != 0) {
                simple[i]++;
            }
            System.out.print(simple[i] + ",");
        }
        System.out.println();


    }


}
