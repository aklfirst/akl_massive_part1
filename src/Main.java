public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        int[] weights = {90,91,92,93,94,95,91,90,0,0,0,45};
//        weights[0] = 90;
//        int januaryWeight = weights[0];
//        System.out.println(januaryWeight);
//        System.out.println(weights[0]);
//        System.out.println(weights[4]);
//        System.out.println(weights[13]);
//        int january = 0;
//        System.out.println(weights[january]);
//        for (int i = 0; i < weights.length; i++) {
//            System.out.println(weights[i]);
//        }
//        int weightsSize = weights.length;
//        System.out.println(weightsSize);
//        int a = weights[weightsSize - 1];
//        System.out.println(a);

// Домашнее Задание - 1

        int simple[] = new int[3];
        simple[0] = 1;
        simple[1] = 2;
        simple[2] = 3;
        for (int i = 0; i < simple.length; i++) {
        System.out.println(simple[i]);}


        double simple2[] = {1.57, 7.654, 9.986};
            for (int i1 = 0; i1 < simple2.length; i1++) {
            System.out.println(simple2[i1]);
            }

        int jan = 1;
        int feb = 2;
        int mar = 3;
        int apr = 4;
        int may = 5;
        int jun = 6;
        int jul = 7;
        int aug = 8;
        int sep = 9;
        int oct = 10;
        int nov = 11;
        int dec = 12;

        int simple3[] = {jan, feb, mar, apr, may, jun, jul, aug, sep, oct, nov, dec};

        for (int i2 = 0; i2 < simple3.length; i2++) {
        System.out.println(simple3[i2]);
        }
        int a = simple3.length-1;
        System.out.println(simple3[a]);

// Домашнее Задание - 2
        for (int i = 0; i < simple.length; i++) {
            int comma = simple.length - 1;
            if (i == comma) {
                System.out.print(simple[i]);}
                else System.out.print(simple[i] + ",");}
        System.out.println();

        for (int i1 = 0; i1 < simple2.length; i1++) {
            int comma1 = simple2.length - 1;
            if (i1 == comma1) {
                System.out.print(simple2[i1]);}
            else System.out.print(simple2[i1]+",");}
            System.out.println();

        for (int i2 = 0; i2 < simple3.length; i2++) {
            int comma2 = simple3.length -1;
            if (i2 == comma2) { System.out.print(simple3[i2]);}
            else System.out.print(simple3[i2] + ",");}
            System.out.println();

// Домашнее задание 3
        for (int i = simple.length-1; i >= 0; i--) {
            if (i == 0) {System.out.print(simple[i]);}
            else System.out.print(simple[i] + ",");}
        System.out.println();

        for (int i1 = simple2.length-1; i1 >= 0; i1--) {
            if (i1 ==0) { System.out.print(simple2[i1]);}
            else System.out.print(simple2[i1] + ",");}
        System.out.println();

        for (int i2 = simple3.length-1; i2 >= 0; i2--) {
            if (i2==0){ System.out.print(simple3[i2]);}
            else System.out.print(simple3[i2] + ",");}
        System.out.println();

// Домашнее задание 4
        for (int i = 0; i < simple.length; i++) {
           if (simple[i] % 2 !=0) {
                simple[i]++;}
           System.out.print(simple[i] + ",");}
        System.out.println();


    }


        }
