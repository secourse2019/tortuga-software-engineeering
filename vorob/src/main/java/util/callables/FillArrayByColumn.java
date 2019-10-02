package util.callables;

public class FillArrayByColumn implements IFIllArray {
    public void call(char[][] array, int i, int j, char content) {
        array[j][i] = content;
    }
}
