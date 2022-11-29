import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static final int[] arr = new int[10001];
    private static int x;
    private static int y;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        int max = 0;

        for (int i = 0; i < x; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }

        System.out.println(bs(1, max));

    }

    public static long bs(long start, long end) {
        long mid = (start + end) / 2;

        if (start > end) {
            return mid;
        }

        int a = 0;

        for (int i = 0; i < x; i++) {
            a += (arr[i] / mid);
        }

        if (a < y) {
            return bs(start, mid - 1);
        }
        return bs(mid + 1, end);
    }
}
