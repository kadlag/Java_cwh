import java.util.Scanner;

public class CommonArray {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter how many element in first array");
        int n1 = input.nextInt();

        int a[] = new int[n1];

        System.out.println("Enter how many element in second array");
        int n2 = input.nextInt();

        int b[] = new int[n2];

        System.out.println("Enter elements of first array");
        for (int i = 0; i < n1; i++) {
            a[i] = input.nextInt();

        }

        System.out.println("Enter elements of second array");
        for (int i = 0; i < n2; i++) {
            b[i] = input.nextInt();

        }

        System.out.println("Elements of first array");
        for (int i = 0; i < n1; i++) {
            System.out.println(a[i]);

        }

        System.out.println("Elements of Second array");
        for (int i = 0; i < n2; i++) {
            System.out.println(b[i]);

        }

        System.out.println("Common elements are:");

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (a[i] == b[j]) {
                    System.out.println(a[i]);
                }
            }
        }
        input.close();
    }

}
