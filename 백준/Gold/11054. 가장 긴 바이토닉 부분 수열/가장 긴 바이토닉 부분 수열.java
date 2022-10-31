import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[1001];
        int[] d1 = new int[1001];
        int[] d2 = new int[1001];
        int max = 0;

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= n; i++) {
            d1[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && d1[i] < d1[j] + 1) {
                    d1[i] = d1[j] + 1;
                }
            }
        }

        for (int i = n; i >= 1; i--) {
            d2[i] = 1;
            for (int j = n; j > i; j--) {
                if (arr[i] > arr[j] && d2[i] < d2[j] + 1) {
                    d2[i] = d2[j] + 1;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            int i1 = d1[i] + d2[i] - 1;
            if (i1 > max) {
                max = i1;
            }
        }
        System.out.println(max);
    }
}
