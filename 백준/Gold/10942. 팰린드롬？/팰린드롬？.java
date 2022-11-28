import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int[] nums = new int[n+1];

        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i=1; i<=n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(reader.readLine());

        StringBuilder sb = new StringBuilder();

        while (m-- > 0) {

            st = new StringTokenizer(reader.readLine());

            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());

            if(isPelin(nums,left,right)) {
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }

        }

        System.out.print(sb);


    }

    private static boolean isPelin(int[] nums, int left, int right) {

        while (left <= right) {
            if (nums[left] != nums[right]) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

}
