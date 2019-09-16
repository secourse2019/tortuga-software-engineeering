package util.callables;

public class FillArrayByRow implements IFIllArray {
    public void call(char[][] array, int i, int j, char content) {
        array[i][j] = content;
    }
}
