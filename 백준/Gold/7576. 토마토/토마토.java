import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(bf.readLine());
      
      int result = 0;     
      int notYet = 0;      
        
      int M = Integer.parseInt(st.nextToken());
      int N = Integer.parseInt(st.nextToken());
        
      int[][] days = new int[N][M];     
      int[][] tomatos = new int[N][M];  
        
      Queue<Pair> qu = new LinkedList<>();
        
      int[] dx = {1, 0 , -1, 0};   
      int[] dy = {0, 1, 0, -1};
      
      for(int i=0; i<N; i++){
          st = new StringTokenizer(bf.readLine());
          for(int j=0; j<M; j++){
              days[i][j] = -1;  
              int num = Integer.parseInt(st.nextToken());
              tomatos[i][j] = num;
              if(num == 1){
                  qu.offer(new Pair(i, j)); 
                  days[i][j] = 0;           
              }else if(num == 0){
                  notYet++;  
              }
          }
      }
      
      if(notYet == 0){
          System.out.print(0);
          System.exit(0);
      }
      
      while(!qu.isEmpty()){
          Pair p = qu.poll();
          
          for(int i=0; i<4; i++){
              int nX = p.x + dx[i];
              int nY = p.y + dy[i];
              
              if(nX <0 || nX >= N || nY < 0 || nY >= M){
                  continue;
              }
              if(tomatos[nX][nY] == -1 || days[nX][nY] != -1){
                  continue;
              }
              qu.offer(new Pair(nX, nY)); notYet--;
              days[nX][nY] = days[p.x][p.y] + 1;
              if(result < days[nX][nY]){
                  result = days[nX][nY];
              }
          }
      }
      
      if(notYet > 0){
          System.out.print(-1);
      }else{
          System.out.print(result);
      }
    }
    
    public static class Pair{
        int x, y;
        
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}