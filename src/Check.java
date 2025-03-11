import java.util.ArrayList;
import java.util.Arrays;

public class Check {
    private int[][] arr;

    public Check (int[][] array){
        arr = array;
    }

    private int[] getColumn(int i){
        int column[] = new int[arr.length];
        for (int j = 0; j < arr.length; j++){
            column[j] = arr[j][i];
        }
        return column;
    }

    public boolean duplicate(){
        for (int j = 0; j < arr.length; j++) {

            for (int i = 0; i < arr.length; i++) {
                int[] column = getColumn(j);
                int num = column[i];

                for (int k = i + 1; k < column.length; k++) {
                    if (num == column[k]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
