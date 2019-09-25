using System; 

namespace Dec
{
    public class Decoder
    {
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

    
        public static string SimplePermutationMthod(string encrypted_message, int row, int column)
        {
            string decrypted_message = "";

            char[, ] matrix = new char[row, column];

            int count = 0;

            for(int i = 0; i != row; i++)
            {
                for(int j = 0; j != column; j++)
                {
                    matrix[i, j] = encrypted_message[count];
                    count++;
                }
            }
            
            for(int j = 0; j != column; j++)
            {
                for(int i = 0; i != row; i++)
                {
                    decrypted_message += matrix[i, j]; 
                }
            }

            return decrypted_message;
        }

        public static string KeyPermutationMethod(string encrypted_message, string key, int row, int column)
        {
            string decrypted_message = "";

            char[, ] matrix = RetrunMatrixMessage(encrypted_message, row, column);
            
            char[ ] charstr = key.ToCharArray();
            for(int i = 0; i != column; i++)
            {
                for(int j = 0; j != column; j++)
                {      
                    if(charstr[j] > charstr[j + 1])
                    {   
                        SwapColumns(matrix, row, j, j + 1);
                    }
                }
            }

            for(int i = 0; i != row ; i++)
            {
                for(int j = 0; j != column; j++)
                {
                    decrypted_message += matrix[i, j]; 
                }
            }
            return decrypted_message;
        }



    }
}
