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

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        char[][] arr = new char[x][y];
        int[][] cnt = new int[x][y];
        boolean[][][] vis = new boolean[2][x][y];

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        Queue<Triple> queue = new LinkedList<>();

        if (x == 1 || y == 1) {
            System.out.println(1);
            System.exit(0);
        }

        for (int i = 0; i < x; i++) {
            String s = br.readLine();
            for (int j = 0; j < y; j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        queue.offer(new Triple(0, 0, 0));

        while (!queue.isEmpty()) {

            Triple triple = queue.poll();

            for (int i = 0; i < 4; i++) {
                int mx = triple.x + dx[i];
                int my = triple.y + dy[i];

                if (mx < 0 || mx >= x || my < 0 || my >= y) {
                    continue;
                }

                if (arr[mx][my] == '1') {
                    if (triple.c == 0 && !vis[1][mx][my]) {
                        vis[triple.c][mx][my] = true;
                        cnt[mx][my] = cnt[triple.x][triple.y] + 1;
                        queue.offer(new Triple(mx, my, 1));
                    }
                } else {
                    if (!vis[triple.c][mx][my]) {
                        vis[triple.c][mx][my] = true;
                        cnt[mx][my] = cnt[triple.x][triple.y] + 1;
                        queue.offer(new Triple(mx, my, triple.c));
                    }
                }
                if (mx == x - 1 && my == y - 1) {
                    System.out.println(cnt[mx][my] + 1);
                    System.exit(0);
                }
            }
        }

        System.out.println(-1);
    }

    public static class Triple {
        int x, y, c;

        public Triple(int x, int y, int c) {
            this.x = x;
            this.y = y;
            this.c = c;
        }
    }
}
