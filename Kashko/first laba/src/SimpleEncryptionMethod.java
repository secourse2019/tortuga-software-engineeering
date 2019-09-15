public class SimpleEncryptionMethod {

    public static String GetDecryptString(int row, int column, String text){
        text = Util.ChangeSpacesRevers(text);
        return runSimpleEncriptionMethod(row, column, text);
    }

    public static String GetEncryptedString(int row, int column, String text){
        text = Util.ChangeSpaces(text);
        return runSimpleEncriptionMethod(column, row,text);
    }

    private static String runSimpleEncriptionMethod(int row, int column, String text){

        char[][] matrix = Util.GetMatrix(row,column,text);
        StringBuilder str = new StringBuilder();
        int temp = 0;
        for(int i = 0; i < column; ++i){
            for(int j = 0; j < row; ++j, ++temp){
                str.insert(temp, matrix[j][i]);
            }
        }
        return str.toString();
    }

}
