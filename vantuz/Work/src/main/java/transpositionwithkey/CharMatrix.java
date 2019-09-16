package transpositionwithkey;

import util.Util;
import util.callables.FillArrayByColumn;

public class CharMatrix {
    private char[][] mesage;
    private int columnsCount;
    private int rowsCount;

    public CharMatrix(String text, int columnsCount) {

    }

    private void swapSymbols(int firstColIndex, int secondColIndex, int rowIndex)
    {
        char fSymbol = this.mesage[rowIndex][firstColIndex];
        this.mesage[rowIndex][firstColIndex] = this.mesage[rowIndex][secondColIndex];
        this.mesage[rowIndex][secondColIndex] = fSymbol;
    }

    private void swapColumns(int firstColumnIndex, int secondColumnIndex)
    {
        for (int rowIndex = 0; rowIndex < this.rowsCount; ++rowIndex)
        {
            swapSymbols(firstColumnIndex, secondColumnIndex, rowIndex);
        }
    }

    private void encryptMessage() {

    }
}