package leetCode;

public class LeetCode463 {
	public int islandPerimeter(int[][] grid) {
		int islands = 0, neibor = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1) {
					islands++;
					if (i < grid.length - 1 && grid[i + 1][j] == 1)
						neibor++;
					if (j < grid[i].length - 1 && grid[i][j + 1] == 1)
						neibor++;
				}
			}
		}
		return islands * 4 - neibor * 2;
	}
}
