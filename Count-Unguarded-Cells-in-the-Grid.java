class Solution {
    // guard = 1, wall = 2, passed = 3
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int g[][] = new int[m][n];

        for(int guard[] : guards) {
            int x = guard[0];
            int y = guard[1];
            g[x][y] = 1;
        }

        for(int wall[] : walls) {
            int x = wall[0];
            int y = wall[1];
            g[x][y] = 2;
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(g[i][j] == 1) {
                    dfs(i, j, g);
                }
            }
        }

        // *** COUNTING UNGUARDED CELLS ***
        int count = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(g[i][j] == 0) { // empty and not passed, not guarded
                    count++;
                }
            }
        }
        return count;
    }

    void dfs(int i, int j, int g[][]) {
        int m = g.length;
        int n = g[0].length;

        int dirs[][] = {{0,1},{1,0},{0,-1},{-1,0}};

        for(int d[] : dirs) {
            int x = i + d[0];
            int y = j + d[1];

            while(x >= 0 && x < m && y >= 0 && y < n && g[x][y] != 1 && g[x][y] != 2) {
                if(g[x][y] == 0) {
                    g[x][y] = 3; // passed
                }
                x += d[0];
                y += d[1];
            }
        }
    }
}
