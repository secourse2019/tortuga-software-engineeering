public class Caesar {

    public static void info(){ //show helpful info
        System.out.print("Usage: $ Java Caesar [OPTION] <Text> <Step>\n\nProgram for encrypting and decrypting text by using a Caesar method\n\n\t-h\tHelp\n\t-c\tUse for encrypting text\n\t-d\tUse for decrypting text\n\nStep must be a integer number\n\nExamples:\n$ java Caesar -c TryMeBitch 4\n$ java Caesar -d XizJuTpFbtz@ 1\n");
    }

    public static class CycleValue { //this class has a value that cyclically varies from 0 to the "border" specified by the user
        protected int currentValue = 0;
        protected int border;

        public CycleValue(int _border, int value){
            this.currentValue = value;
            this.border = _border;
            cutValue();
        }

        protected void cutValue(){
            if(currentValue>0){
                this.currentValue = this.currentValue%this.border;
            }else{
                this.currentValue = this.border - Math.abs(this.currentValue%this.border);
            }
        }

        public int setCurrenValue(int value){ //set the current value
            this.currentValue = value;
            this.cutValue();
            return currentValue;
        }

        public int getCurrentValue(){ //get the current value
            return this.currentValue;
        }

        public int addition(int value){ // add or decrease current value
            this.currentValue += value;
            this.cutValue();
            return this.currentValue;
        }
    }
    public static void main(String[] args){
        int border = 94;
        int startIndex = 33;
        int step = 0;
        int modifier = 1;

        CycleValue letterIndex = new CycleValue(border,0);

        if(args.length == 0){ // if you run a program without arguments
            System.out.println("[!]Something went wrong! Use help(-h) for more info");
            System.exit(11);
        }

        switch (args[0]){ //Check out the flag
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
                info();
                System.exit(10);
        }

        if(args.length != 3){
            System.out.print((char)27 +"[31m[!]Something went wrong!");
            System.out.println((char)27 + "[37m Use help(-h) for more info");
            System.exit(1488);
        }else{
            char []text = args[1].toCharArray();
            step = Integer.parseInt (args[2]);
            for(int i =0; i < text.length; i++){
                letterIndex.setCurrenValue((int)text[i] - startIndex);
                letterIndex.addition(modifier * step);
                text[i] = (char)(startIndex+letterIndex.getCurrentValue());
            }
            System.out.print("Done! => ");
            System.out.print((char)27 + "[32m");
            for(int i =0; i < text.length; i++){
                System.out.print(text[i]);
            }
            System.out.print((char)27 + "[37m");
        }
    }
}
