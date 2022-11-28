import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        int result = 1;

        if (input > 1) {
            for (int i = 1; input > 1; i++) {
                result++;
                int a = i * 6;
                input -= a;
            }
            System.out.println(result);
        } else {
            System.out.println(1);
        }
    }
}
