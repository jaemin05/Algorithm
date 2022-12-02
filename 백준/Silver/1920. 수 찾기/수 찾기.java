import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static int[] arr;
    private static int x;
    private static int y;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        x = Integer.parseInt(br.readLine());
        arr = new int[x];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < x; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }
        Arrays.sort(arr);

        y = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < y; i++) {
            int num = Integer.parseInt(st.nextToken());
            System.out.println(bs(0, arr.length - 1, num));
        }
    }

    public static long bs(int start, int end, int t) {
        long mid = (start + end) / 2;

        if(start >= end) {
            return arr[end] == t ? 1 : 0;
        }

        if (arr[(int) mid] < t) {
            return bs((int) mid + 1, end, t);
        }
        return bs(start, (int) mid, t);
    }
}
