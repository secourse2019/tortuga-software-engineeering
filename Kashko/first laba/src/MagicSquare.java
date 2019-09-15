import java.util.ArrayList;

interface Insert{
    char call(String text, int i, int[] arr);
}

class EncryptInsert implements Insert {
    public char call(String text, int i, int[] arr){
        return text.charAt(arr[i]-1);
    }

}

class DecryptInsert implements Insert {
    public char call(String text, int i, int[] arr){
        return text.charAt(i);
    }
}

public class MagicSquare {

    private static String GetCharArr(int[] arr, String text, Insert encriptInsert){
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < arr.length; ++i){
            res.insert(i, encriptInsert.call(text, i, arr));
        }
        return res.toString();
    }

    public static String GetEncrytStr(int[] arr, String text){
        text = Util.ChangeSpaces(text);
        return GetCharArr(arr, text, new EncryptInsert());
    }

    public static String GetDecryptStr(int[] arr, String text){
        text = Util.ChangeSpacesRevers(text);
        String textArr = GetCharArr(arr, text, new DecryptInsert());
        char[] res = new char[arr.length];
        for (int i = 0; i < textArr.length(); i++) {
            res[arr[i]-1] = textArr.charAt(i);
        }
        return new String(res);
    }

}
