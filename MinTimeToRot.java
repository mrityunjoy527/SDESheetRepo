package sdeSheetQues;

import java.util.*;

public class MinTimeToRot {
    static int minTimeToRot(int[][] grid, int n, int m) {
        if(grid.length == 0 || grid == null) return 0;
        Queue<int[]> q = new LinkedList<>();
        int cntorgs = 0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j] == 2) {
                    q.add(new int[]{i, j});
                }
                if(grid[i][j] != 0) cntorgs++;
            }
        }
        if(cntorgs == 0) return 0;
        int ans = 0, cnt = 0;
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        while(!q.isEmpty()) {
            int size = q.size();
            cnt += size;
            for(int i=0; i<size; i++) {
                int[] p = q.poll();
                for(int j=0; j<4; j++) {
                    int x = p[0] + dx[j];
                    int y = p[1] + dy[j];
                    if(x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == 2 || grid[x][y] == 0) continue;
                    grid[x][y] = 2;
                    q.add(new int[]{x, y});
                }
            }
            if(q.size() != 0) ans++;
        }
        return cnt == cntorgs ? ans : -1;
    }
}
