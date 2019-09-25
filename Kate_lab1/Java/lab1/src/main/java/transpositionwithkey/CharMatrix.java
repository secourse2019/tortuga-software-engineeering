package transpositionwithkey;

import util.Util;
import util.callables.FillArrayByColumn;

public class CharMatrix {
    private char[][] data;
    private int columnsCount;
    private int rowsCount;

    public CharMatrix(String text, int columnsCount) {
        this.columnsCount = columnsCount;
        this.rowsCount = text.length() / this.columnsCount;

        if (text.length() - (this.rowsCount * this.columnsCount) != 0) {
            this.rowsCount = (text.length() + this.columnsCount) / this.columnsCount;
        }

        int newSymbolsCount = text.length() - (this.rowsCount * this.columnsCount);
        for (int i = 0; i < newSymbolsCount; ++i) {
            text += ' ';
        }

        this.data = new char[this.rowsCount][this.columnsCount];
        Util.fillCharMatrix(text, this.data, this.rowsCount, this.columnsCount, new FillArrayByColumn());
    }
}
