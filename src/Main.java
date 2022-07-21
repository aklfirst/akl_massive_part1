public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] weights = {90,91,92,93,94,95,91,90,0,0,0,45};
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
//        System.out.println(weights[13]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }
        int weightsSize = weights.length;
        System.out.println(weightsSize);
        int a = weights[weightsSize - 1];
        System.out.println(a);
    }
}