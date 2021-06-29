import java.lang.Math;

public class LightBoard {
    private boolean [][] lights;

    public LightBoard(int numRows, int numCols){
        lights = new boolean[numRows][numCols];
        for (int r = 0; r < numRows; r++){
            for (int c = 0; c < numCols; c++){
                double chance = Math.random();
                if (chance < 0.4){
                    lights[r][c] = true;
                }
            }
        }
    }

    public boolean evaluateLight(int row, int col){
        int numOn = 0;
        // current column's light statue
        // trick we should use r not c
        for (int r = 0; r < lights.length; r ++){
            if (lights[r][col]){
                numOn++;
            }
        }
        if (lights[row][col] && numOn % 2 == 0){
            return false;
        }
        if (lights[row][col] == false && numOn % 3 == 0){
            return true;
        }
        return lights[row][col];
    }

    public static void main(String args[]){
        LightBoard lb = new LightBoard(7, 5);
        System.out.println(lb.evaluateLight(0, 3));
        System.out.println(lb.evaluateLight(2, 3));
    }
}
