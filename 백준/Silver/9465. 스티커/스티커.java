import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[][] a = new int[100001][2];
        int[][] b = new int[100001][3];

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= x; i++) {
                int zero = Integer.parseInt(st.nextToken());
                a[i][0] = zero;
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= x; i++) {
                int one = Integer.parseInt(st.nextToken());
                a[i][1] = one;
            }

            b[0][0] = b[0][1] = b[0][2] = 0;

            for (int i = 1; i <= x; i++) {
                b[i][0] = max(max(b[i - 1][0], b[i - 1][1]), b[i - 1][2]);
                b[i][1] = max(b[i - 1][0], b[i - 1][2]) + a[i][0];
                b[i][2] = max(b[i - 1][0], b[i - 1][1]) + a[i][1];
            }

            int result = max(max(b[x][0], b[x][1]), b[x][2]);

            System.out.println(result);
        }
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }
}
