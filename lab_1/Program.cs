using System;
using Enc;
using Dec;


namespace lab_ZKI
{
    class Program
    {
        static void Main(string[] args)
        {
            
            string temp = "УСПЕХ – ЭТО КОГДА ТЫ ДЕВЯТЬ РАЗ УПАЛ, НО ДЕСЯТЬ РАЗ ПОДНЯЛСЯ";
            
            Console.WriteLine("res: {0}", Encoder.KeyPermutationMethod("МЫ ДОЛЖНЫ ПРИЗНАТЬ ОЧЕВИДНОЕ: ПОНИМАЮТ ЛИШЬ ТЕ, КТО ХОЧЕТ ПОНЯТЬ", "МЫСЛЕННО", 8, 8));
            Console.ReadKey();
        }
    }
}
