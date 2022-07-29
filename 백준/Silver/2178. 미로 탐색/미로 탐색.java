import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] arr = new char[n][m];
        int[][] dist = new int[n][m];

        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, 1, 0, -1};
        Queue<Pair> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = line.charAt(j);
                dist[i][j] = -1;
            }
        }

        queue.offer(new Pair(0, 0));
        dist[0][0] = 0;

        while (!queue.isEmpty()) {
            Pair pair = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = pair.x + dx[i];
                int ny = pair.y + dy[i];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    continue;
                }
                if (arr[nx][ny] == '0' || dist[nx][ny] != -1) {
                    continue;
                }
                queue.offer(new Pair(nx, ny));
                dist[nx][ny] = dist[pair.x][pair.y] + 1;
            }
        }
        System.out.println(dist[n - 1][m - 1] + 1);
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
