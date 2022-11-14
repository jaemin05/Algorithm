import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] d = new int[5001];

        String input = br.readLine();
        int mod = 1000000;

        d[0] = 1;
        for (int i = 1; i <= input.length(); i++) {
            int x = input.charAt(i - 1) - '0';
            if (1 <= x && x <= 9) {
                d[i] += d[i - 1];
                d[i] %= mod;
            }
            if (i == 1) {
                continue;
            }
            if (input.charAt(i - 2) == '0') {
                continue;
            }

            x = (input.charAt(i - 2) - '0') * 10 + (input.charAt(i - 1) - '0');
            if (10 <= x && x <= 26) {
                d[i] += d[i - 2];
                d[i] %= mod;
            }
        }

        System.out.println(d[input.length()]);
    }
}
