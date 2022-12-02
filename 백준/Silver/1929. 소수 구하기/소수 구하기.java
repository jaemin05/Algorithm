import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int x;
    private static int y;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());

        /*
         * 소수: 2 3 5 7  자기 자신
         */

        Boolean[] arr = new Boolean[y + 1];

        arr[0] = arr[1] = true;

        for (int i = 2; i <= y; i++) {
            arr[i] = false;
        }

        for (int i = 2; i * i <= y; i++) {
            if (!arr[i]) {
                for (int j = i+i; j <= y; j += i) {
                    arr[j] = true;
                }
            }
        }

        for (int i = x; i <= y; i++) {
            if (!arr[i]) {
                System.out.println(i);
            }
        }
    }
}
