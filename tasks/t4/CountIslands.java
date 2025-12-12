package tasks.t4;

import java.util.*;

public class CountIslands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            String input = scanner.nextLine().trim();
            
            List<List<Integer>> grid = parseInput(input);
            
            if (grid.isEmpty() || grid.get(0).isEmpty()) {
                System.out.println(0);
                return;
            }
            
            int result = countIslands(grid);
            System.out.println(result);
            
        } catch (Exception e) {
            System.out.println(0);
        } finally {
            scanner.close();
        }
    }
    
    private static List<List<Integer>> parseInput(String input) {
        List<List<Integer>> grid = new ArrayList<>();
        
        input = input.trim();
        if (input.startsWith("[[")) {
            input = input.substring(2, input.length() - 2);
        }
        
        String[] rows = input.split("\\],\\[");
        
        for (String row : rows) {
            List<Integer> rowList = new ArrayList<>();
            String[] cells = row.split(",");
            
            for (String cell : cells) {
                rowList.add(Integer.parseInt(cell.trim()));
            }
            
            grid.add(rowList);
        }
        
        return grid;
    }
    
    public static int countIslands(List<List<Integer>> grid) {
        if (grid == null || grid.isEmpty()) {
            return 0;
        }
        
        int rows = grid.size();
        int cols = grid.get(0).size();
        int islandCount = 0;
        
        boolean[][] visited = new boolean[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid.get(i).get(j) == 1 && !visited[i][j]) {
                    islandCount++;
                    dfs(grid, visited, i, j, rows, cols);
                }
            }
        }
        
        return islandCount;
    }
    
    private static void dfs(List<List<Integer>> grid, boolean[][] visited, 
                           int i, int j, int rows, int cols) {
        if (i < 0 || i >= rows || j < 0 || j >= cols || 
            grid.get(i).get(j) == 0 || visited[i][j]) {
            return;
        }
        
        visited[i][j] = true;
        
        dfs(grid, visited, i - 1, j, rows, cols); 
        dfs(grid, visited, i + 1, j, rows, cols);
        dfs(grid, visited, i, j - 1, rows, cols); 
        dfs(grid, visited, i, j + 1, rows, cols); 
    }
}