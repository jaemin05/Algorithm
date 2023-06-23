import java.util.*;

class Solution {
    public static class Pair {
        int x,y;
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    public static int[] dx = {1,0,-1,0};
    public static int[] dy = {0,1,0,-1};
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        bfs(0,0,maps,n,m);
        if(maps[n-1][m-1] == 1) {
            return -1;
        }
        return maps[n-1][m-1];
    }
    
    public static void bfs(int x, int y, int[][]maps, int n, int m) {
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(x,y));
        
        while(!q.isEmpty()) {
            Pair pair = q.poll();
            for(int i=0; i<4; i++) {
                int nx = pair.x + dx[i];
                int ny = pair.y + dy[i];
                if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if(maps[nx][ny] == 0) continue;
                if(maps[nx][ny] == 1) {
                    maps[nx][ny] = maps[pair.x][pair.y] + 1;
                    q.offer(new Pair(nx, ny));
                }
            }
        }
    }
}