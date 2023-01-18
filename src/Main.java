import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача-1");
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        double[] b = {1.57, 7.654, 9.986};
        int[] c = {85, 54, 95, 23};
        System.out.println("Задача - 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(b[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.print(c[i] + ", ");
        }
        System.out.println();
        System.out.println("Задача - 3");
        for (int i = 2; i >= 0; i--) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
        for (int i = 2; i >= 0; i--) {
            System.out.print(b[i] + ", ");
        }
        System.out.println();
        for (int i = 3; i >= 0; i--) {
            System.out.print(c[i] + ", ");
        }
        System.out.println();

        System.out.println("Задача - 4");
        for (int i = 0; i < 3; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]=a[i]+1);
            }
        }
    }

    }