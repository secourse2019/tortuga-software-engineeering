import java.util.Scanner;

public class MSquare {

    public static void Info() //show helpful info
    {
        System.out.print("Usage: $ Java MSquare [OPTION] <Text> \n\nProgram for encrypting and decrypting text by using a Magick square\n\n\t-h\tHelp\n\t-c\tUse for encrypting text\n\t-cI\n\t-d\tUse for decrypting text\n\t-dI\n\nSse the modifier 'I'(-cI/-dI) to manually fill the square\n\nExamples:\n$ java MSquare -c TryMeBitch\n$ java MSquare -d sIonirmzegaziCCI\n");
    }

    public static void SortArrays(int[][] array, char[][] text)
    {
        for(int i = 0; i < 15; i ++)
        {
            int ind = FindMin(array,i);
            if( i != ind)
            {
                IntSwap(array, i, ind);
                CharSwap(text, i, ind);
            }
        }
    }

    public static void UnSortArrays(int[][] array, char[][] text)
    {
        int [] swapIndex= new int[15];
        for(int i = 0; i < 15; i ++)
        {
            int ind = FindMin(array,i);
            swapIndex[i] = ind;
            if( i != ind)
            {
                IntSwap(array, i, ind);
            }
        }
        for(int i = 14; i >= 0; i --)
        {
            if( i != swapIndex[i])
            {
                CharSwap(text, i, swapIndex[i]);
            }
        }
    }

    public static int FindMin(int[][] array, int start)
    {
        int min = start;
        for(int i = start+1; i < 16; i ++)
        {
            if(array[min/4][min%4] > array[i/4][i%4])
            {
                min = i;
            }
        }
        return min;
    }

    public static void CharSwap(char[][] array,int x1, int x2)
    {
        char temp= array[x1/4][x1%4];
        array[x1/4][x1%4] = array[x2/4][x2%4];
        array[x2/4][x2%4] = temp;
    }

    public static void IntSwap(int[][] array,int x1, int x2)
    {
        int temp= array[x1/4][x1%4];
        array[x1/4][x1%4] = array[x2/4][x2%4];
        array[x2/4][x2%4] = temp;
    }

    public static void FillArrayByRows(char[][] array, String text) //filling the rows of the array with the text
    {
        for(int ind = 0; ind < text.length(); ind++)
        {
            array[ind/4][ind%4] = text.charAt(ind);
        }
    }

    public static void ReadArrayByRows(char[][] array) //output the rows of the array
    {
        for(int ind = 0; ind < 16; ind++)
        {
            System.out.print(array[ind/4][ind%4]);
        }
    }

    public static void SetSquare(int[][] array)
    {
        Scanner input = new Scanner(System.in);
        for(int i  = 0; i < 16; i++)
        {
            System.out.print("Square ");
            System.out.print((char) 27 + "[32m");
            System.out.printf( "%d : %d",(i/4)+1,(i%4)+1);
            System.out.print((char) 27 + "[37m");
            System.out.print(" => ");
            array[i/4][i%4] = input.nextInt();
        }

    }

    public static void main(String[] args) {
        int [][]MagickSquare = {{2,12,5,15},{9,8,11,6},{16,1,14,3},{7,13,4,10}};
        char [][]Text = new char[4][4];
        for(int i = 0; i < 16; i ++)
        {
            Text[i/4][i%4] = '.';
        }
        boolean action_crypt = true;
        boolean customArray = false;

        if(args.length == 0) // if you run a program without arguments
        {
            System.out.println("[!]Something went wrong! Use help(-h) for more info");
            System.exit(11);
        }

        switch (args[0]) //Check out the flag
        {
            case "-cI":
                customArray = true;
            case "-c":
                action_crypt = true;
                break;

            case "-dI":
                customArray = true;
            case "-d":
                action_crypt = false;
                break;

            default:
                System.out.println((char)27 +"[31m[!]Something went wrong!");
                System.out.print((char)27 + "[37m");
            case "-h":
                Info();
                System.exit(10);
        }

        if(args.length == 2)
        {
            if(args[1].length() > 16)
            {
                System.out.println((char)27 +"[31m[!]Text must be less than 16 symbols!");
                System.exit(1488);
            }
            else
            {
                FillArrayByRows(Text,args[1]);
            }
        }
        else
        {
            System.out.print((char)27 +"[31m[!]Something went wrong!");
            System.out.println((char)27 + "[37m Use help(-h) for more info");
        }

        if(customArray)
        {
            System.out.println("Set your own Square:");
            SetSquare(MagickSquare);
        }

        if(action_crypt)//set of functions for encrypting and decrypting text
        {
            SortArrays(MagickSquare,Text);
            System.out.print("Done! => ");
            System.out.print((char)27 + "[32m");
            ReadArrayByRows(Text);
            System.out.print((char)27 + "[37m");
            System.out.println();
        }
        else
        {
            UnSortArrays(MagickSquare, Text);
            System.out.print("Done! => ");
            System.out.print((char) 27 + "[32m");
            ReadArrayByRows(Text);
            System.out.print((char) 27 + "[37m");
            System.out.println();
        }
        //System.out.print(FindMin(MagickSquare,1));
    }
}
