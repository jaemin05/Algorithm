import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int[] arr = new int[1000001];
    private static int result = 0;
    private static int x;
    private static int y;
    private static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < x; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] > max) max = arr[i];
        }

        System.out.println(bs(0, max));

    }

    public static long bs(long start, long end) {

        long mid = (start + end) / 2;
        long a = 0;

        if(start > end) return end;

        for (int i = 0; i < x; i++) {
            if (arr[i] > mid) {
                a += (arr[i] - mid);
            }
        }
        
        if (a == y) return mid;

        if (a < y) return bs(start, mid - 1);
        
        return bs(mid + 1, end);
    }
}