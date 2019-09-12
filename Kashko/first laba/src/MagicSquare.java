public class MagicSquare {

    private static String ChangeSpaces(String text){
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

    public static char[] GetEncryptedArr(int[] arr, String text){
        char[] res = new char[arr.length];
        for(int i = 0; i < arr.length; ++i){
            res[i] = text.charAt(arr[i]-1);
        }
        return res;
    }

    private static char[] GetCharArr(int[] arr, String text){
        char[] res = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = text.charAt(i);
        }
        return res;
    }

    public static String GetEncrytStr(int[] arr, String text){
        text = ChangeSpaces(text);
        char[] encrArr = GetEncryptedArr(arr, text);
        return new String(encrArr);
    }

    public static String GetDecryptStr(int[] arr, String text){
        text = ChangeSpacesRevers(text);
        char[] textArr = GetCharArr(arr, text);
        char[] res = new char[arr.length];
        for (int i = 0; i < textArr.length; i++) {
            res[arr[i]-1] = textArr[i];
        }
        return new String(res);
    }

}
