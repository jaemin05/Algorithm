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

        int z = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int[][][] tomato = new int[x][y][z];
        int[][][] days = new int[x][y][z];

        int notTomato = 0;
        int max = 0;

        int[] dx = {1, 0, -1, 0, 0, 0};
        int[] dy = {0, 1, 0, -1, 0, 0};
        int[] dz = {0, 0, 0, 0, 1, -1};

        Queue<Triple> queue = new LinkedList<>();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < z; k++) {
                    tomato[i][j][k] = Integer.parseInt(st.nextToken());
                    if (tomato[i][j][k] == 1) {
                        queue.offer(new Triple(i, j, k));
                        days[i][j][k] = 0;
                    } else {
                        days[i][j][k] = -1;
                        if (tomato[i][j][k] == 0) {
                            notTomato += 1;
                        }
                    }
                }
            }
        }

        if (notTomato == 0) {
            System.out.println(0);
            System.exit(0);
        }

        while (!queue.isEmpty()) {
            Triple triple = queue.poll();

            for (int i = 0; i < 6; i++) {
                int mx = triple.x + dx[i];
                int my = triple.y + dy[i];
                int mz = triple.z + dz[i];

                if (mx < 0 || mx >= x || my < 0 || my >= y || mz < 0 || mz >= z || days[mx][my][mz] != -1 || tomato[mx][my][mz] == -1) {
                    continue;
                }

                queue.offer(new Triple(mx, my, mz));
                notTomato -= 1;

                days[mx][my][mz] = days[triple.x][triple.y][triple.z] + 1;

                if (days[mx][my][mz] > max) {
                    max = days[mx][my][mz];
                }
            }
        }

        if (notTomato > 0) {
            System.out.println(-1);
        } else {
            System.out.println(max);
        }
    }

    public static class Triple {
        int x, y, z;

        public Triple(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
}
