import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[][] array;
    static boolean[][] vis;

    static int n, m;
    static int[] dx;
    static int[] dy;

    static Queue<Pair> queue;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        array = new int[n][m];
        vis = new boolean[n][m];
        queue = new LinkedList<>();

        dx = new int[]{1, 0, -1, 0};
        dy = new int[]{0, 1, 0, -1};

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;
        int area = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] == 0 || vis[i][j]) {
                    continue;
                }

                count++;
                queue.offer(new Pair(i, j));
                vis[i][j] = true;
                area = 0;

                while (!queue.isEmpty()) {
                    Pair pair = queue.poll();
                    area++;

                    for (int k = 0; k < 4; k++) {
                        int nx = pair.x + dx[k];
                        int ny = pair.y + dy[k];
                        if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                            continue;
                        }
                        if (array[nx][ny] == 1 && !vis[nx][ny]) {
                            queue.offer(new Pair(nx, ny));
                            vis[nx][ny] = true;
                        }
                    }
                }
                if (area > max) {
                    max = area;
                }
            }
        }
        System.out.println(count);
        System.out.println(max);
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
