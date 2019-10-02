package transpositionwithkey;

import util.Util;
import util.callables.FillArrayByColumn;

public class CharMatrix {
    private char[][] message;
    private int columnsCount;
    private int rowsCount;

    public CharMatrix(String text, int columnsCount) {
        this.columnsCount = columnsCount;
        this.rowsCount = text.length() / this.columnsCount;

        if (text.length() - (this.rowsCount * this.columnsCount) != 0) {
            this.rowsCount = (text.length() + this.columnsCount) / this.columnsCount;
        }

        this.message = new char[this.rowsCount][this.columnsCount];

        int newSymbolsCount = (this.rowsCount * this.columnsCount) - text.length();
        for (int charCode = 33; (charCode - 33) < newSymbolsCount; ++charCode) {
            text += (char)charCode;
        }

        Util.fillCharMatrix(text, this.message, this.columnsCount, this.rowsCount, new FillArrayByColumn());
    }

    public int getColumnsCount() {
        return this.columnsCount;
    }

    public int getRowsCount() {
        return this.rowsCount;
    }

    public void swapSymbols(int firstColIndex, int secondColIndex, int rowIndex)
    {
        char fSymbol = this.message[rowIndex][firstColIndex];
        this.message[rowIndex][firstColIndex] = this.message[rowIndex][secondColIndex];
        this.message[rowIndex][secondColIndex] = fSymbol;
    }

    public void swapColumns(int firstColumnIndex, int secondColumnIndex)
    {
        for (int rowIndex = 0; rowIndex < this.rowsCount; ++rowIndex)
        {
            swapSymbols(firstColumnIndex, secondColumnIndex, rowIndex);
        }
    }

    public char[][] getMessage() {
        return message;
    }
}