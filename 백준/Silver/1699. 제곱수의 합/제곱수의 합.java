import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[100001];

        for (int i = 1; i <= n; i++) {
            arr[i] = i;
            for (int j = 1; j * j <= i; j++) {
                int x = arr[i - j * j] + 1;
                if (arr[i] > x) {
                    arr[i] = x;
                }
            }
        }

        System.out.println(arr[n]);
    }
}
