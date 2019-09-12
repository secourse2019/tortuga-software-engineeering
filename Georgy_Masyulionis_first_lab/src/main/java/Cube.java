public class Cube {
    private int row;
    private int col;
    private String text;
    private int[][] Cube;

    Cube(String text, int[][] Matrix) {
        row = col = Matrix.length;
        this.text = text;
        Cube = new int[row][col];
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                Cube[i][j] = Matrix[i][j];
            }
        }
    }

    public void encrypt() {
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                System.out.print(text.charAt(Cube[i][j] - 1));

            }
        }
        System.out.println();
    }

    public void decrypt() {
        char[] temp = new char[row * row];
        for (int i = 0, t = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j, ++t) {
                temp[Cube[i][j]-1] = text.charAt(t);
            }
        }
        for (char lul : temp) {
            System.out.print(lul);
        }
        System.out.println();
    }
}
