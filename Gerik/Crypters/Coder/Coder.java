

public class Coder
{
    public static void info(){ //show helpful info
        System.out.print("Usage: $ Java Coder [OPTION] <Text> <KeyWord>\n\nProgram for encrypting and decrypting text by building a matrix and changing the location of columns by using the key word\n\n\t-h\tHelp\n\t-c\tUse for encrypting text\n\t-d\tUse for decrypting text\n\nKeyWord is optional\n\nExamples:\n$ java Coder -c TryMeBitch\n$ java Coder -d SbsaZuayYaklaae Allah\n");
    }

    public static int findWidthAndHeight(int length, boolean Height){ //find a width or a height of array
        while (true){
            for(int i = 10; i > 2; i--){
                if(length%i == 0 && length/i>1){
                    if(Height){
                        return length/i;
                    }else{
                        return i;
                    }
                }
            }
            length++;
        }
    }

    public static int findHeight(int length, int width){ //find a height by using a keyword length like a width
        double x = (double)length / (double)width;
        return (int)Math.ceil(x);
    }

    public static void fillArrayByCols(char[][] array, String text, int height){ //filling the columns of the array with the text
        for(int ind = 0; ind < text.length(); ind++){
            array[ind%height][ind/height] = text.charAt(ind);
        }
    }

    public static void fillArrayByRows(char[][] array, String text, int width){ //filling the rows of the array with the text
        for(int ind = 0; ind < text.length(); ind++){
            array[ind/width][ind%width] = text.charAt(ind);
        }
    }

    public static void readArrayByRows(char[][] array, int height, int width){ //output the rows of the array
        for(int ind = 0; ind < height*width; ind++) {
            System.out.print(array[ind/width][ind%width]);
        }
    }

    public static void readArrayByCols(char[][] array, int height, int width){ //output the columns of the array
        for(int ind = 0; ind < height*width; ind++){
            System.out.print(array[ind%height][ind/height]);
        }
    }

    public static void printArray(char[][] array, int height, int width){ //print array like a square
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void swapCols(char[][] array, int heigth, int index1, int index2){ //swap columns of the array
        for(int i = 0; i < heigth; i++){
            array[i][index1] = (char) (array[i][index1] ^ array[i][index2]);
            array[i][index2] = (char) (array[i][index1] ^ array[i][index2]);
            array[i][index1] = (char) (array[i][index1] ^ array[i][index2]);
        }
    }

    public static int findMinCharIndex(char[] text, int start){ //find index of the smallest element
        int temp = start;
        for(int i = start+1; i < text.length; i++){
            if(text[temp] > text[i]){
                temp = i;
            }
        }
        return temp;
    }

    public static void sortByKey(char[][] array, int heigth, String keyw){ //sort a columns of the array by using a KeyWord
        char []keywArray = keyw.toCharArray();
        for(int i = 0; i < keyw.length()-1; i++){
            int ind = findMinCharIndex(keywArray,i);

            if(i != ind){
                keywArray[i] = (char) (keywArray[i] ^ keywArray[ind]);
                keywArray[ind] = (char) (keywArray[i] ^ keywArray[ind]);
                keywArray[i] = (char) (keywArray[i] ^ keywArray[ind]);

                swapCols(array, heigth, i, ind);
            }
        }
    }

    public static void unSortByKey(char[][] array, int heigth, String keyw){ //unsort a columns of the array by step by step restore sort sequence
        char []keywArray = keyw.toCharArray();
        int []swaps = new int[keyw.length()-1];
        for(int i = 0; i < keyw.length()-1; i++){
            int ind = findMinCharIndex(keywArray,i);

            swaps[i] = ind;

            if(i != ind){
                keywArray[i] = (char) (keywArray[i] ^ keywArray[ind]);
                keywArray[ind] = (char) (keywArray[i] ^ keywArray[ind]);
                keywArray[i] = (char) (keywArray[i] ^ keywArray[ind]);
            }
        }

        for(int i = swaps.length-1; i >= 0 ; i--){
            if(i != swaps[i]){
                swapCols(array, heigth, i, swaps[i]);
            }
        }
    }

    public static void main(String[] args) {
        String keyw = "";
        String text = "";
        boolean actionCrypt = true;
        int width = 10;
        int height = 10;

        if(args.length == 0){ // if you run a program without arguments
            System.out.println("[!]Something went wrong! Use help(-h) for more info");
            System.exit(11);
        }

        switch (args[0]){ //Check out the flag
            case "-c":
                actionCrypt = true;
                break;
            case "-d":
                actionCrypt = false;
                break;
            default:
                System.out.println((char)27 +"[31m[!]Something went wrong!");
                System.out.print((char)27 + "[37m");
            case "-h":
                info();
                System.exit(10);
        }

        switch (args.length){ //Set KeyWord and action(crypt or decrypt)
            case 2:
                text = args[1];
                keyw = "";
                height = findWidthAndHeight(text.length(),true);
                width = findWidthAndHeight(text.length(),false);
                break;
            case 3:
                text = args[1];
                keyw = args[2];
                width = args[2].length();
                height = findHeight(text.length(),keyw.length());
                break;
            default:
                System.out.print((char)27 +"[31m[!]Something went wrong!");
                System.out.println((char)27 + "[37m Use help(-h) for more info");
                System.exit(1488);
                break;
        }

        char [][]array = new char[height][width]; //creating an array and filling it with dots
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                array[i][j] = '.';
            }
        }

        if(actionCrypt){ //set of functions for encrypting and decrypting text
            fillArrayByCols(array, text, height);
            if(keyw.length() > 0){
                sortByKey(array,height,keyw);
            }
            System.out.print("Your square:\n------------\n");
            printArray(array,height,width);
            System.out.print("------------\nDone! => ");
            System.out.print((char)27 + "[32m");
            readArrayByRows(array,height,width);
            System.out.print((char)27 + "[37m");
            System.out.println();
        }else {
            fillArrayByRows(array, text, width);
            if(keyw.length() > 0) {
                unSortByKey(array,height,keyw);
            }
            System.out.print("Your square:\n------------\n");
            printArray(array,height,width);
            System.out.print("------------\nDone! => ");
            System.out.print((char)27 + "[32m");
            readArrayByCols(array,height,width);
            System.out.print((char)27 + "[37m");
            System.out.println();
        }
    }
}
