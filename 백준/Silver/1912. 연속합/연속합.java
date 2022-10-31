import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Math.max;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[100001];
        int[] d1 = new int[100001];
        int max;
        
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        d1[1] = arr[1];
        max = d1[1];
        for (int i = 2; i <= n; i++) {
            d1[i] = max(d1[i - 1] + arr[i], arr[i]);
            if (d1[i] > max) {
                max = d1[i];
            }
        }
        System.out.println(max);
    }
}
