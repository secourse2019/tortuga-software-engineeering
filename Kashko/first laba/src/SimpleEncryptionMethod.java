public class SimpleEncryptionMethod {

    protected static String ChangeSpaces(String text){
        StringBuilder temp = new StringBuilder();
        temp.append(text);
        while (text.indexOf(' ') != -1) {
            temp.setCharAt(text.indexOf(' '), '_');
            text = temp.toString();
        }
        return text;
    }

    protected static String ChangeSpacesRevers(String text){
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

    protected static char[][] GetMatrix(int row, int column, String text){
        char [][]matrix = new char[row][column];
        char []arr_text = text.toCharArray();
        int init = 0;
        for(int i = 0; i < row; ++i){
            for(int j = 0; j < column; ++j, ++init){
                matrix[i][j] = arr_text[init];
            }
        }
        return matrix;
    }

    protected static char[][] GetMatrixForEncryptString(int row, int column, String text){
        char [][]matrix = new char[column][row];
        char []arr_text = text.toCharArray();
        int init = 0;
        for(int i = 0; i < column; ++i){
            for(int j = 0; j < row; ++j, ++init){
                matrix[i][j] = arr_text[init];
            }
        }
        return matrix;
    }

    public static String GetDecryptString(int row, int column, String text){
        text = ChangeSpacesRevers(text);
        char [][]matrix = GetMatrix(row,column,text);
        char []encryptStr = new char[row * column];
        int temp = 0;
        for(int i = 0; i < column; ++i){
            for(int j = 0; j < row; ++j, ++temp){
                encryptStr[temp] = matrix[j][i];
            }
        }
        return new String(encryptStr);
    }

    public static String GetEncryptedString(int row, int column, String text){
        text = ChangeSpaces(text);
        char[][] matrix = GetMatrixForEncryptString(row, column, text);
        char[] encryptStr = new char[row*column];
        int temp = 0;
        for(int i = 0; i < row; ++i){
            for(int j = 0; j < column; ++j, ++temp){
                encryptStr[temp] = matrix[j][i];
            }
        }
        return new String(encryptStr);
    }

}
