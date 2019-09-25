using System;
using Enc;
using Dec;

namespace lab_ZKI
{
    class Program
    {
        static void Main(string[] args)
        {
            
            
            Console.WriteLine("res: {0}", Encoder.KeyPermutationMethod("МЫ ДОЛЖНЫ ПРИЗНАТЬ ОЧЕВИДНОЕ: ПОНИМАЮТ ЛИШЬ ТЕ, КТО ХОЧЕТ ПОНЯТЬ", "МЫСЛЕННО", 8, 8));
            Console.WriteLine("res1: {0}",Decoder.KeyPermutationMethod(Encoder.KeyPermutationMethod("МЫ ДОЛЖНЫ ПРИЗНАТЬ ОЧЕВИДНОЕ: ПОНИМАЮТ ЛИШЬ ТЕ, КТО ХОЧЕТ ПОНЯТЬ", "МЫСЛЕННО", 8, 8), "МЫСЛЕННО", 8, 8));
            Console.ReadKey();
        }
    }
}
