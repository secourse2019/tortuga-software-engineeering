public class Caesar {

    public static void Info() //show helpful info
    {
        System.out.print("Usage: $ Java Caesar [OPTION] <Text> <Step>\n\nProgram for encrypting and decrypting text by using a Caesar method\n\n\t-h\tHelp\n\t-c\tUse for encrypting text\n\t-d\tUse for decrypting text\n\nStep must be a integer number\n\nExamples:\n$ java Caesar -c TryMeBitch 4\n$ java Caesar -d XizJuTpFbtz@ 1\n");
    }
    public static class CycleValue
    {
        protected int currentValue = 0;
        protected int border;
        CycleValue(int _border, int value)
        {
            currentValue = value;
            border = _border;
            cutValue();
        }
        protected void cutValue()
        {
            if(currentValue>0)
            {
                currentValue = currentValue%border;
            }
            else
            {
                currentValue = border - Math.abs(currentValue%border);
            }
        }

        public int setValue(int value)
        {
            currentValue = value;
            cutValue();
            return currentValue;
        }

        public int getValue()
        {
            return currentValue;
        }

        public int add(int value)
        {
            currentValue += value;
            cutValue();
            return currentValue;
        }
    }
    public static void main(String[] args) {
        int border = 94;
        int startIndex = 33;
        int step = 0;
        int modifier = 1;
        CycleValue letterIndex = new CycleValue(border,0);

        if(args.length == 0) // if you run a program without arguments
        {
            System.out.println("[!]Something went wrong! Use help(-h) for more info");
            System.exit(11);
        }

        switch (args[0]) //Check out the flag
        {
            case "-c":
                modifier = 1;
                break;
            case "-d":
                modifier = -1;
                break;
            default:
                System.out.println((char)27 +"[31m[!]Something went wrong!");
                System.out.print((char)27 + "[37m");
            case "-h":
                Info();
                System.exit(10);
        }

        if(args.length != 3)
        {
            System.out.print((char)27 +"[31m[!]Something went wrong!");
            System.out.println((char)27 + "[37m Use help(-h) for more info");
            System.exit(1488);
        }
        else
        {
            char []text = args[1].toCharArray();
            step = Integer.parseInt (args[2]);
            for(int i =0; i < text.length; i++)
            {
                letterIndex.setValue((int)text[i] - startIndex);
                letterIndex.add(modifier * step);
                text[i] = (char)(startIndex+letterIndex.getValue());
            }
            System.out.print("Done! => ");
            System.out.print((char)27 + "[32m");
            for(int i =0; i < text.length; i++)
            {
                System.out.print(text[i]);
            }
            System.out.print((char)27 + "[37m");
        }
    }
}
