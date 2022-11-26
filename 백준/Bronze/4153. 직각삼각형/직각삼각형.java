import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            boolean tf = false;

            if (String.valueOf(x).equals("0") && String.valueOf(y).equals("0") && String.valueOf(z).equals("0")) {
                break;
            }

            if (Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(z, 2) ||
                    Math.pow(y, 2) + Math.pow(z, 2) == Math.pow(x, 2) ||
                    Math.pow(x, 2) + Math.pow(z, 2) == Math.pow(y, 2)) {
                tf = true;
            }


            if (tf) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
