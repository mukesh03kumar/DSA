class Solution {
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};

    public static int solve(int x, int y, int grid[][], int n, int m){
        int gold = grid[x][y];

        grid[x][y] = 0;

        int ans = 0;

        for(int k=0; k<4; k++){
            int new_x = x + dx[k];
            int new_y = y + dy[k];

            if(new_x >= 0 && new_x < n && new_y >= 0 && new_y < m && grid[new_x][new_y] != 0){
                ans = Math.max(ans, solve(new_x, new_y, grid, n, m));
            }
        }

        grid[x][y] = gold;

        return gold+ans;
    }

    public int getMaximumGold(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] != 0){
                    int value = solve(i, j, grid, n, m);

                    if(value > ans){
                        ans = value;
                    }
                }
            }
        }

        return ans;
    }
}