import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int[][] arr = new int[1001][11];
        int count = 0;

        for(int i = 0; i<=9; i++) {
            arr[1][i] = 1;
        }
        
        for(int i=2; i<=num; i++) {
            for(int j=0; j<=9; j++) {
                for(int k=0; k<=j; k++) {
                    arr[i][j] += arr[i-1][k];
                    arr[i][j] %= 10007;                     
                }
            }
        }
        
        for(int i=0; i<=9; i++) {
            count += arr[num][i];
            count %= 10007;
        }

        System.out.println(count);
    }
}
