using System;

namespace Enc
{
    public class Encoder
    {
        private static void SwapChar(char[] charstr, int intdex)
        {
            char temp;
            temp = charstr[intdex];
            charstr[intdex] = charstr[intdex + 1];
            charstr[intdex + 1] = temp;
        }

        private static string ReturnEncryptedMessage(char[, ] matrix, int row, int column)
        {
            string encrypted_message = "";

            for(int i = 0; i != row; i++)
            {
                for(int j = 0; j != column; j++)
                {
                    encrypted_message += matrix[i, j]; 
                }
            }
            return encrypted_message;
        }

        private static void SwapSymbols(char[, ] matrix,int firstColIndex, int secondColIndex, int rowIndex)
        {
            char fSymbol = matrix[rowIndex, firstColIndex];
            matrix[rowIndex, firstColIndex] = matrix[rowIndex, secondColIndex];
            matrix[rowIndex, secondColIndex] = fSymbol;
        }

        private static void SwapColumns(char[, ] matrix, int rowsCount, int firstColumnIndex, int secondColumnIndex)
        {
            for(int rowIndex = 0; rowIndex < rowsCount; ++rowIndex)
            { 
                SwapSymbols(matrix, firstColumnIndex, secondColumnIndex, rowIndex);
            }
        }

        private static char[, ] RetrunMatrixMessage(string message, int row, int column)
        {
            char[, ] matrix = new char[row, column];
            

            int count = 0;

            for(int j = 0; j != column; j++)
            {
                for(int i = 0; i != row; i++)
                {
                    matrix[i, j] = message[count];
                    count++;
                }
            }

            return matrix;
        }
        
        public static string SimplePermutationMethod(string message, int row, int column)
        {
            string encrypted_message = "";

            char[, ] matrix = RetrunMatrixMessage(message, row, column);
            
            encrypted_message = ReturnEncryptedMessage(matrix, row, column);

            return encrypted_message;
        }

        public static string KeyPermutationMethod(string message, string key, int row, int column)
        {
            string encrypted_message = "";

            char[, ] matrix = RetrunMatrixMessage(message, row, column);
            
            char[ ] charstr = message.ToCharArray();
            for(int i = 0; i != column; i++)
            {
                for(int j = 0; j != column; j++)
                {      
                    if(charstr[j] > charstr[j + 1])
                    {   
                        SwapColumns(matrix, row, j, j + 1);
                        SwapChar(charstr, j);
                    }
                }
            }

            encrypted_message = ReturnEncryptedMessage(matrix, row, column);
        
            return encrypted_message;
        }
        
        public static string MagicSquareMethod(string nessage, int size)//, int[, ] matrix);
        {
            string encrypted_message = "";
            
            

            return encrypted_message;
        } 
    }
}
