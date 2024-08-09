class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        // Get the number of rows (n) and columns (m) in the grid
        int n = grid.length;
        int m = grid[0].length;

        // Initialize a counter for counting the number of magic squares
        int cnt = 0;

        // Iterate over all possible 3x3 subgrids in the grid
        for (int i = 0; i <= n - 3; i++) {
            for (int j = 0; j <= m - 3; j++) {
                // Check if the current 3x3 subgrid is a magic square
                if (isMagicGrid(grid, i, j)) {
                    // If it is, increment the counter
                    cnt++;
                }
            }
        }
        // Return the total count of magic squares found
        return cnt;
    }

    // Helper method to check if a 3x3 subgrid is a magic square
    public boolean isMagicGrid(int[][] grid, int r, int c) {
        // Create a HashSet to store unique numbers in the subgrid
        HashSet<Integer> st = new HashSet<>();

        // Check that each number in the 3x3 subgrid is unique and between 1 and 9
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num = grid[r + i][c + j];
                // If the number is out of range or a duplicate, it's not a magic square
                if (num < 1 || num > 9 || st.contains(num)) return false;
                else st.add(num);
            }
        }

        // Calculate the sum of the first row to use as the reference sum
        int s = grid[r][c] + grid[r][c + 1] + grid[r][c + 2];

        // Check that each row and column in the 3x3 subgrid sums to the reference sum
        for (int i = 0; i < 3; i++) {
            if (grid[r + i][c] + grid[r + i][c + 1] + grid[r + i][c + 2] != s) return false;
            if (grid[r][c + i] + grid[r + 1][c + i] + grid[r + 2][c + i] != s) return false;
        }

        // Check that both diagonals in the 3x3 subgrid sum to the reference sum
        if (grid[r][c] + grid[r + 1][c + 1] + grid[r + 2][c + 2] != s) return false;
        if (grid[r][c + 2] + grid[r + 1][c + 1] + grid[r + 2][c] != s) return false;

        // If all checks pass, the subgrid is a magic square
        return true;
    }
}
