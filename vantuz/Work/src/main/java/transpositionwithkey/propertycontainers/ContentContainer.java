package transpositionwithkey.propertycontainers;

import transpositionwithkey.CharMatrix;
import transpositionwithkey.data.types.Pair;

import java.util.ArrayList;

public class ContentContainer {
    private CharMatrix message;
    private String key;
    public ArrayList<Pair> dictKey;

    public ContentContainer(String text, String key) {
        this.message = new CharMatrix(text, key.length());
        setDictKey(key);
    }

    private void setDictKey(String key) {
        this.key = key;
        this.dictKey = new ArrayList<Pair>();
        for (int i = 0; i < key.length(); ++i) {
            this.dictKey.add(new Pair(key.charAt(i), i));
        }
    }

    public CharMatrix getMessage() {
        return message;
    }
    public int getColumnsCount() {
        return message.getColumnsCount();
    }
    public int getRowsCount() {
        return message.getRowsCount();
    }
    public void swapColumnsInMessage(int fColumn, int sColumn) {
        message.swapColumns(fColumn, sColumn);
    }
    public void swapPairsInDickKey(int fPair, int sPair) {
        Pair firstPair = dictKey.get(fPair);
        dictKey.set(fPair, dictKey.get(sPair));
        dictKey.set(sPair, firstPair);
    }
}
