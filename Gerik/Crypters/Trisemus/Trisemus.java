public class Trisemus {

    public static void info() //show helpful info
    {
        System.out.print("Usage: $ Java Trisemus [OPTION] <Text> <KeyWord>\n\nProgram for encrypting and decrypting text by using a Trisemus method\n\n\t-h\tHelp\n\t-c\tUse for encrypting text\n\t-d\tUse for decrypting text\n\nExamples:\n$ java Trisemus -c TryMeBitch example\n$ java Coder -d CBDTKHKHTKMIFCXOQMMCHJVQSNFOCSV wowstringareuseful\n");
    }

    public static String burnReps(String text){ //create a new string without repeating characters
        String temp = "";
        for(int i = 0; i < text.length(); i++){
            if(temp.indexOf(text.charAt(i)) == -1){
                temp = temp + text.charAt(i);
            }
        }
        return temp;
    }

    public static String crypt(String text, String table){ //main function of encrypting and decrypting
        char []arrText = text.toUpperCase().toCharArray();
        for(int i = 0; i < text.length(); i++){
            if(table.indexOf(arrText[i]) != -1){
                arrText[i] = table.charAt((table.indexOf(arrText[i])+13)%26);
            }
        }
        String temp = "";
        for(int i = 0; i < arrText.length;i++){
            temp += arrText[i];
        }
        return temp;
    }

    public static void main(String[] args){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        boolean actionCrypt = true;

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

        if(args.length != 3){
            System.out.print((char)27 +"[31m[!]Something went wrong!");
            System.out.println((char)27 + "[37m Use help(-h) for more info");
            System.exit(1488);
        }else{
            System.out.print("Done => ");
            System.out.print((char)27 + "[32m");
            System.out.println(crypt(args[1],burnReps(args[2].toUpperCase() + alphabet)));
            System.out.print((char)27 + "[37m");
        }
    }
}
