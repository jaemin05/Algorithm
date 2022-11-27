import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        long add = 0;
        long pow = 1;

        StringTokenizer st = new StringTokenizer(br.readLine());
        String arr = st.nextToken();

        for (int i = 0; i < input; i++) {
            add += ((arr.charAt(i) - 'a' + 1) * pow);
            pow = (pow * 31) % 1234567891;

        }
        System.out.println(add%1234567891);
    }
}
