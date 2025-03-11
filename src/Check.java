import java.util.ArrayList;

public class Check {
    private int[][] arr;

    public Check (int[][] array){
        arr = array;
    }
// 123168
    private int[] getColumn(){
        int column[] = new int[arr.length];
        for (int i = 0; i < arr[0].length; i++){
            for (int j = 0; j < arr.length; j++){
                column[j] = arr[i][j];
            }
        }
        System.out.println(column);
        return column;
    }

    public boolean duplicate(){
        int[] column = getColumn();
        for (int i = 0; i < column.length; i++){
            int num = column[i];
            for (int j = i+1; j < column.length; j++){
                if (num == column[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
