import java.lang.reflect.Array;
import java.util.Arrays;

public class EncryptionMetthodWithWord extends SimpleEncryptionMethod {

    private static char[] SortKey (String key){
        char sortedKey[] = key.toCharArray();
        Arrays.sort(sortedKey);
        return sortedKey;
    }

    private static int[] ReverseArr(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
        return arr;
    }

    private static int[] NewColumnOrder(String key, char sortedKey []){
        int res[] = new int[key.length()];
        StringBuilder temp = new StringBuilder();
        temp.append(key);
        for(int i = 0; i < sortedKey.length; ++i){
           res[i] = (key.indexOf(sortedKey[i]));
           temp.setCharAt(key.indexOf(sortedKey[i]), ' ');
           key = temp.toString();
        }
        return res;
    }

    private static int[] NewColumnOrderDecrypt(String key, char sortedKey []){
        int res[] = new int[key.length()];
        char [] copy = key.toCharArray();
        String a = new String(sortedKey);
        StringBuilder temp = new StringBuilder();
        temp.append(sortedKey);
        for(int i = 0; i < key.length(); ++i){
            res[i] = (a.indexOf(copy[i]));
            temp.setCharAt(a.indexOf(copy[i]), '_');
            key = temp.toString();
            a = temp.toString();
        }

        return res;
    }

    private static char[][] ChangeMatrixByWord(char[][] matrix, int row, int column, int[] letters){
        char [][] res = new char[row][column];
        for(int i = 0; i < row; ++i){
            for(int j = 0; j < column; ++j){
                res[i][j] = matrix[letters[i]][j];
            }
        }
        return res;
    }

    public static String GetEncryptStringWithWord (int row, int column, String text, String key){
        char SortKey[] = SortKey(key);
        text = ChangeSpaces(text);
        int lettersIndex[] = NewColumnOrder(key, SortKey);
        char [][] encryptedMatrix = ChangeMatrixByWord(GetMatrix(row, column, text), row, column, lettersIndex);
        char [] result = new char[row * column];
        int temp = 0;
        for(int i = 0; i < row; ++i){
            for(int j = 0; j < column; ++j, ++temp){
                result[temp] = encryptedMatrix[j][i];
            }
        }
        return new String(result);
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
        text = ChangeSpacesRevers(text);
        int [] lettersIndex = NewColumnOrderDecrypt(key,SortKey(key));
        char [][] res = GetNewMatrixWithoutWord(GetMatrix(row, column, text),row,column, lettersIndex);
        char [] decStr = new char[row * column];
        int init = 0;
        for(int i = 0; i < column; ++i){
            for(int j = 0; j < row; ++j, ++init){
                decStr[init] = res[i][j];
            }
        }
        return new String(decStr);
    }

}
