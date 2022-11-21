import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n + 1][m + 1];
        int[][] input = new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                arr[i][j] = 0;
                input[i][j] = 0;
            }
        }

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= m; j++) {
                arr[i][j] = 0;
                int num = Integer.parseInt(st.nextToken());
                input[i][j] = num;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                input[i][j] += getMax(input[i - 1][j - 1], input[i - 1][j], input[i][j - 1]);
                arr[i][j] = input[i][j];
            }
        }

        System.out.println(arr[n][m]);
    }

    public static int getMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}
