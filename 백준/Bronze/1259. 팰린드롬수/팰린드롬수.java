import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String st = br.readLine();
            boolean tf = true;
            if (st.equals("0")) {
                break;
            }

            for (int i = 0; i < st.length() / 2; i++) {
                if (st.charAt(i) != st.charAt(st.length() - 1 - i)) {
                    tf = false;
                }
            }
            if(tf == true) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
