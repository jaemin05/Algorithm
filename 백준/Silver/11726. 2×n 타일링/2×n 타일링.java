import java.util.Scanner;

public class Main {

    static int[] df = new int[1001];

    public static void main(String[] args) {
        Scanner __ = new Scanner(System.in);
        int i = __.nextInt();

        System.out.println(t(i));
    }

    public static int t(int i) {
        if(i == 1) {
            return 1;
        } else if(i == 2) {
            return 2;
        } else if(df[i] != 0) {
            return df[i];
        }
        
        return df[i] = (t(i-1) + t(i-2)) % 10007;
    }
}
