import java.util.Scanner;

public class Main {

    static int[] df = new int[12];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i = 0; i < input; i++) {
            int a = sc.nextInt();
            System.out.println(t(a));
        }
    }

    public static int t(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else if (n == 3) {
            return 4;
        } else if (df[n] != 0) {
            return df[n];
        }
        return df[n] = t(n - 3) + t(n - 2) + t(n - 1);
    }
}
