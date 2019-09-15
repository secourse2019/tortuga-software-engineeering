import java.util.ArrayList;

public class Util {

    public static String ChangeSpaces(String text){
        StringBuilder temp = new StringBuilder();
        temp.append(text);
        while (text.indexOf(' ') != -1) {
            temp.setCharAt(text.indexOf(' '), '_');
            text = temp.toString();
        }
        return text;
    }

    public static String ChangeSpacesRevers(String text){
        StringBuilder temp = new StringBuilder();
        temp.append(text);
        while (text.indexOf('_') != -1) {
            temp.setCharAt(text.indexOf('_'), ' ');
            text = temp.toString();
        }
        return text;
    }

    protected static void PrintMatrix(char[][] matrix, int row, int column){
        for(int i = 0; i < row; ++i){
            for(int j = 0; j < column; ++j){
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    protected static void ReversPrintMatrix(char[][] matrix, int row, int column){
        for(int i = 0; i < column; ++i){
            for(int j = 0; j < row; ++j){
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static char[][] GetMatrix(int row, int column, String text){
        char [][]matrix = new char[row][column];
        int init = 0;
        for(int i = 0; i < row; ++i){
            for(int j = 0; j < column; ++j, ++init){
                matrix[i][j] = text.charAt(init);
            }
        }
        return matrix;
    }

    protected static char[][] GetMatrixForEncryptString(int row, int column, String text){
        return GetMatrix(column, row, text);
    }

    protected static ArrayList GetArrayList(int[] arr){
        ArrayList res = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            res.add(arr[i]);
        }
        return res;
    }

}
