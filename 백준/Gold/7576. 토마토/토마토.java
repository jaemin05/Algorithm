import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int day = 0;
        int notTomato = 0;

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[][] days = new int[n][m];
        int[][] tomato = new int[n][m];

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        Queue<Pair> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                days[i][j] = -1;
                int num = Integer.parseInt(st.nextToken());
                tomato[i][j] = num;

                if (num == 1) {
                    queue.offer(new Pair(i, j));
                    days[i][j] = 0;
                } else if (num == 0) {
                    notTomato++;
                }
            }
        }

        if (notTomato == 0) {
            System.out.println(0);
            System.exit(0);
        }

        while (!queue.isEmpty()) {
            Pair pair = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = pair.x + dx[i];
                int ny = pair.y + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m || tomato[nx][ny] == -1 || days[nx][ny] != -1) {
                    continue;
                }

                queue.offer(new Pair(nx, ny));
                notTomato--;

                days[nx][ny] = days[pair.x][pair.y] + 1;

                if (day < days[nx][ny]) {
                    day = days[nx][ny];
                }
            }
        }

        if (notTomato > 0) {
            System.out.println(-1);
        } else {
            System.out.println(day);
        }
    }

    public static class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
