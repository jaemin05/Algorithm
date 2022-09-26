import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        char[][] arr = new char[x][y];
        int answer = 64;

        for (int i = 0; i < x; i++) {
            String s = br.readLine();
            for (int j = 0; j < y; j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i <= x - 8; i++) {
            for (int j = 0; j <= y - 8; j++) {
                int temp = 0;
                for (int k = 0; k < 8; k++) {
                    for (int p = 0; p < 8; p++) {
                        if (arr[i + k][j + p] == ((k + p) % 2 == 0 ? 'B' : 'W')) {
                            temp += 1;
                        }
                    }
                }
                if ((temp - 64) * -1 < temp) temp = (temp - 64) * -1;
                if (answer > temp) answer = temp;
            }
        }
        System.out.println(answer);
    }
}
