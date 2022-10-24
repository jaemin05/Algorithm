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
        int[] d = new int[1001];
        int min = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            d[i] = 1;
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j] && d[j] + 1 > d[i]) {
                    d[i] = d[j] + 1;
                }
            }
            if(min < d[i]) {
                min = d[i];
            }
        }
        System.out.println(min);
    }
}
