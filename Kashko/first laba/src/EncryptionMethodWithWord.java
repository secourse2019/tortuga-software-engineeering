import java.util.Arrays;

public class EncryptionMethodWithWord extends SimpleEncryptionMethod {

    private static String SortKey (String key){
        char sortedKey[] = key.toCharArray();
        Arrays.sort(sortedKey);
        return new String(sortedKey);
    }

    private static int[] NewColumnOrder(String key, String sortedKey){
        int res[] = new int[key.length()];
        StringBuilder temp = new StringBuilder(key);
        for(int i = 0; i < sortedKey.length(); ++i){
            res[i] = (key.indexOf(sortedKey.charAt(i)));
            temp.setCharAt(key.indexOf(sortedKey.charAt(i)), ' ');
            key = temp.toString();
        }
        return res;
    }

    private static int[] NewColumnOrderDecrypt(String key, String sortedKey){
        int res[] = new int[key.length()];
        String copyKey = key;
        StringBuilder temp = new StringBuilder(sortedKey);
        for(int i = 0; i < key.length(); ++i){
            res[i] = (sortedKey.indexOf(copyKey.charAt(i)));
            temp.setCharAt(sortedKey.indexOf(copyKey.charAt(i)), '_');
            key = temp.toString();
            sortedKey = temp.toString();
        }

        return res;
    }

    private static char[][] ChangeMatrixByWord(char[][] matrix, int row, int column, int[] letters){
        char [][] res = new char[row][column];
        for(int i = 0; i < row; ++i){
            System.arraycopy(matrix[letters[i]], 0, res[i], 0, column);
        }
        return res;
    }

    public static String GetEncryptStringWithWord (int row, int column, String text, String key){
        String SortKey = SortKey(key);
        text = Util.ChangeSpaces(text);
        int lettersIndex[] = NewColumnOrder(key, SortKey);
        char [][] encryptedMatrix = ChangeMatrixByWord(Util.GetMatrix(row, column, text), row, column, lettersIndex);
        StringBuilder result = new StringBuilder();
        int temp = 0;
        for(int i = 0; i < row; ++i){
            for(int j = 0; j < column; ++j, ++temp){
                result.insert(temp, encryptedMatrix[j][i]);
            }
        }
        return result.toString();
    }

    private static char[][] GetNewMatrixWithoutWord(char[][] matrix, int row, int column, int[] lettersIndex){
        char[][] res = new char[column][row];
        int init = 0;
        for(int i = 0; i < column; ++i, ++init){
            for(int j = 0; j < row; ++j){
                res[i][j] = matrix[j][lettersIndex[init]];
            }
        }
        return res;
    }

    public static String GetDecryptStringWithWord (int row, int column, String text, String key){
        text = Util.ChangeSpacesRevers(text);
        int [] lettersIndex = NewColumnOrderDecrypt(key,SortKey(key));
        char [][] res = GetNewMatrixWithoutWord(Util.GetMatrix(row, column, text),row,column, lettersIndex);
        StringBuilder decStr = new StringBuilder();
        int init = 0;
        for(int i = 0; i < column; ++i){
            for(int j = 0; j < row; ++j, ++init){
                decStr.insert(init, res[i][j]);
            }
        }
        return decStr.toString();
    }

}
