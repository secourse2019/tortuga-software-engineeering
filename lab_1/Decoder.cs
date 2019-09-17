using System; 

namespace Dec
{
    public class Decoder
    {
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


    }
}
