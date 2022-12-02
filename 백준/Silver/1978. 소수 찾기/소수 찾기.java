import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;

        int x = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < x; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(ss(num)) result++;
        }
        System.out.println(result);
    }

    public static boolean ss(int num) {
        if (num == 1) return false;

        for (int i = 2; i < num; i++) {
            if(num%i == 0) return false;
        }

        return true;
    }
}


