import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("задача 2");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        System.out.println(Arrays.toString(one));
        double[] two = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(two));
        int[] three = {2, 3, 100};
        System.out.println(Arrays.toString(three));
        System.out.println(" ");
        System.out.println("задача 3");
        for (int i = 2; i >= 0; i--) {
            System.out.print(one[i] + ", ");
        }
        System.out.println(" ");
        for (int b = 2; b >= 0; b--) {
            System.out.print(two[b] + ", ");
        }
        System.out.println(" ");
        for (int a = 2; a >= 0; a--) {
            System.out.print(three[a] + ", ");
        }
        System.out.println(" ");
        System.out.println("задача 4");
        for (int s = 0; s < one.length; s++) {
            if (one[s] % 2 != 0) {
                one[s]++;
            }
            System.out.print(one[s] + ", ");
        }
    }
}
