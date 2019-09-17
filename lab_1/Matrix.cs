using System;

namespace Mat
{
    public class Matrix<T>
    {
        T[, ] matrix;
        int column;
        int row;

        Matrix(int row, int column)
        {
            this.row = row;
            this.column = column;
            T[, ] matrix = new T[row, column];
        }

        Matrix(T[, ] matrix, int row, int column)
        {
            this.matrix = matrix;
            this.row = row;
            this.column = column;
        }

        public int Row 
        {
            get
            {
                return row;
            }
        }

        public int Column
        {
            get
            {
                return column;
            }
        }
    }
}
