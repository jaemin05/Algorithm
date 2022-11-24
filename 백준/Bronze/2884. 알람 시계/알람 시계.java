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

        if (m < 45) {
            m -= 45;
            int newM = Math.abs(m);
            m = 60 - newM;
            n -= 1;
            if (n < 0) {
                n = 23;
            }
        } else {
            m -= 45;
        }
        System.out.println(n + " " + m);
    }
}
