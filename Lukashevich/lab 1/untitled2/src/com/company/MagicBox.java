package com.company;

public class MagicBox {

    public static String Shif (String text, int[][] box)
    {
        int matrixValue = (box.length * box[0].length);
        if (text.length() < matrixValue) {

            for (int i = text.length(); i < matrixValue; i++)
            {
                text += '.';
            }

        }else if (text.length() > matrixValue) {

            int delta = text.length() - matrixValue;
            text = text.substring(0, text.length() - delta);
        }

        String result = "";

        for (int i = 0; i < box.length; i++)
        {
            for (int j = 0; j < box[0].length; j++)
            {
                result += text.charAt( (box[i][j]) - 1 );
            }
        }


        return result;
    }

    public static String Deshif (String text, int[][] box)
    {
        int matrixValue = (box.length * box[0].length);
        if (text.length() != matrixValue) {

            return "Error : key uncorect";
        }


        char [] result = new char[text.length()];


        int thisChar = 0;

        for (int i = 0; i < box.length; i++)
        {
            for (int j = 0; j < box[0].length; j++)
            {
                result [ (box[i][j] - 1) ]  =  text.charAt( thisChar );
                thisChar++;
            }
        }

        return new String(result);
    }


}
