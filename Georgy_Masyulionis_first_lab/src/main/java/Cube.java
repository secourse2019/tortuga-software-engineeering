public class Cube {
    private int row;
    private int col;
    private String text;
    private int[][] Cube;
    private char[] charCube;

    Cube(String text, int[][] Matrix) {
        row = col = Matrix.length;
        this.text = text;
        Cube = new int[row][col];
        charCube = new char[row*col];
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                Cube[i][j] = Matrix[i][j];
            }
        }
    }

    public void encrypt() {
        for (int i = 0, s = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j, ++s) {
                charCube[s] = text.charAt(Cube[i][j] - 1);
            }
        }
    }

    public void decrypt() {
        for (int i = 0, t = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j, ++t) {
                charCube[Cube[i][j]-1] = text.charAt(t);
            }
        }
    }
    public void print(){
        for (int i = 0; i < row*col; ++i) {
                System.out.print(charCube[i]);
        }
        System.out.println();
    }
}
