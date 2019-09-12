public class Transposition{
    int row;
    int col;
    private char[][] box;
    String text;
    Transposition(String text_, int row_, int col_) {
        row = row_;
        col = col_;
        text = text_;
        box = new char[row][col];
    }

    public void encrypt() {
        for (int i = 0, s = 0; i < col; ++i) {
            for (int j = 0; j < row; ++j, ++s) {
                box[j][i] = text.charAt(s);
            }
        }
    }
    public void decrypt() {
        for (int i = 0, s = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j, ++s) {
                box[i][j] = text.charAt(s);
            }
        }
        String temp = "";
        for (int i = 0; i < col; ++i) {
            for (int j = 0; j < row; ++j) {
                temp = temp.concat(Character.toString(box[j][i]));
            }
        }
        for (int i = 0, s = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j, ++s) {
                box[i][j] = temp.charAt(s);
            }
        }
    }

    public void printBox(){
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j)
                System.out.print(box[i][j]);
        }
        System.out.println();
    }
}

