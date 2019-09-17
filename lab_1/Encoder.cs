using System;

namespace Enc
{
    public class Encoder
    {
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
            
            char[, ] temp = matrix;
            for(int i = 0; i != column; i++)
            {
                for(int j = 0; j != column; j++)
                {      
                    if(message[j] > message[j + 1])
                    {   
                        
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
