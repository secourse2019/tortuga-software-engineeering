public class Transposition{
    int row;
    int col;
    private char[][] box;
    String text;
    Transposition(String text, int row, int col) {
        this.row = row;
        this.col = col;
        this.text = text;
    }

    public void encrypt() {
        box = new char[row][col];
        for (int i = 0, s = 0; i < col; ++i) {
            for (int j = 0; j < row; ++j, ++s) {
                box[j][i] = text.charAt(s);
            }
        }
    }

    public void decrypt() {
        int temp = col;
        col = row;
        row = temp;
        box = new char[row][col];
        encrypt();
    }

    public void printBox(){
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j)
                System.out.print(box[i][j]);
        }
        System.out.println();
    }
}

