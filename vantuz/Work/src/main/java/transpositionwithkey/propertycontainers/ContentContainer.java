package transpositionwithkey.propertycontainers;

import transpositionwithkey.data.types.Pair;
import util.Util;
import util.callables.FillArrayByColumn;

import java.util.ArrayList;

public class ContentContainer {
    private char[][] message;
    private int columnsCount;
    private int rowsCount;
    private String key;
    // val1 - symbol from string
    // val2 - symbol's previous index in string
    public ArrayList<Pair> dictKey;

    public ContentContainer(String text, String key) {
        this.columnsCount = key.length();
        this.rowsCount = text.length() / this.columnsCount;

        if (text.length() - (this.rowsCount * this.columnsCount) != 0) {
            this.rowsCount = (text.length() + this.columnsCount) / this.columnsCount;
        }

        this.message = new char[this.rowsCount][this.columnsCount];

        int newSymbolsCount = text.length() - (this.rowsCount * this.columnsCount);
        for (int i = 0; i < newSymbolsCount; ++i) {
            text += ' ';
        }

        Util.fillCharMatrix(text, this.message, this.rowsCount, this.columnsCount, new FillArrayByColumn());
    }

    private void setDictKey(String key) {
        this.key = key;
        this.dictKey = new ArrayList<Pair>();
        for (int i = 0; i < key.length(); ++i) {
            this.dictKey.add(new Pair(key.charAt(i), i));
        }
    }

    public char[][] getMessage() {
        return message;
    }
    public int getColumnsCount() {
        return columnsCount;
    }
    public int getRowsCount() {
        return rowsCount;
    }
}
