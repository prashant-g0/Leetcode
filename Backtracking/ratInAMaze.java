public class ratInAMaze{

    public static boolean isSafe(int[][] maze, int row, int col){
        return (row >= 0 && row <= maze.length-1 && col >= 0 && col <= maze.length-1 && maze[row][col] == 1);
    }

    public static boolean solver(int[][] maze, int row, int col, int[][] sol){
        if(row == maze.length-1 && col == maze.length-1 && maze[row][col] == 1){
            sol[row][col] = 1;
            return true;
        }

        if(isSafe(maze, row, col)){
            if(sol[row][col] == 1) return false;

            sol[row][col] = 1;
            if(solver(maze, row+1, col, sol)) return true;
            if(solver(maze, row, col+1, sol)) return true;
            sol[row][col] = 0;
            return false;
        }

        return false;
    }

    public static boolean solveMaze(int[][] maze){
        int n = maze.length;
        int[][] sol = new int[n][n];
        if(solver(maze, 0, 0, sol)){
            System.out.println("Solution Exists...");
            printMaze(sol);
            return true;
        } else{
            System.out.println("Solution Does Not Exists...");
            return false;
        }
    }
    
    public static void printMaze(int[][] maze){
        for(int i = 0; i < maze.length; i++) {
            for(int j = 0;j < maze.length;j++) {
                System.out.print(maze[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int maze[][] = { 
            {1,0,0,0},
            {1,1,0,1},
            {0,1,0,0},
            {1,1,1,1} 
        };

        solveMaze(maze);
    }
}