package transpositionwithkey;

import util.Util;
import util.callables.FillArrayByColumn;

public class CharMatrix {
    private char[][] message;
    private int columnsCount;
    private int rowsCount;

    public CharMatrix(String text) {
        this.columnsCount = text.length();
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

    public int getColumnsCount() {
        return this.columnsCount;
    }

    public int getRowsCount() {
        return this.rowsCount;
    }

    private void swapSymbols(int firstColIndex, int secondColIndex, int rowIndex)
    {
        char fSymbol = this.message[rowIndex][firstColIndex];
        this.message[rowIndex][firstColIndex] = this.message[rowIndex][secondColIndex];
        this.message[rowIndex][secondColIndex] = fSymbol;
    }

    private void swapColumns(int firstColumnIndex, int secondColumnIndex)
    {
        for (int rowIndex = 0; rowIndex < this.rowsCount; ++rowIndex)
        {
            swapSymbols(firstColumnIndex, secondColumnIndex, rowIndex);
        }
    }
}