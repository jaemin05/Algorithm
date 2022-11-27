import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;
        Integer input = Integer.parseInt(br.readLine());

        for (int i = 0; i < input; i++) {
            int sum = 0;
            int x = i;

            while (x != 0) {
                sum += x % 10;
                x /= 10;
            }

            if (sum + i == input) {
                result = i;
                break;
            }
        }

        System.out.println(result);


    }
}
