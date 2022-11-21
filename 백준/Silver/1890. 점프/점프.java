import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        long[][] arr = new long[n][n];
        int[][] input = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = 0;
                int num = Integer.parseInt(st.nextToken());
                input[i][j] = num;
            }
        }

        arr[0][0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int k = input[i][j];
                if (k == 0) continue;
                if (j + k < n) {
                    arr[i][j + k] += arr[i][j];
                }
                if (i + k < n) {
                    arr[i + k][j] += arr[i][j];
                }
            }
        }
        
        System.out.println(arr[n - 1][n - 1]);
    }
}
