package MultidimentionalArray;

public class GridMain {

    static int[][] grid;

    public static void main(String[] args) {

        grid = new int[5][5];

        int fill = 1;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                grid[i][j] = fill;
            }
        }

        printGrid();
    }

    public static void printGrid()
    {
        for(int j = 0; j < grid[0].length; j++){
            for(int i = 0; i <  grid.length; i++){
                System.out.print(grid[i][j]);
                if(i == grid.length-1){
                    System.out.println();
                }

            }
        }
    }
}
