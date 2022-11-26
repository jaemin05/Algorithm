import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int data = 0;

        while (x != cnt) {
            data++;
            if (String.valueOf(data).contains("666")) cnt++;
        }

        System.out.println(data);
    }
}
