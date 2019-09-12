public class TranspositionKeyEncrypt {
    private String text;
    private char[] key;
    private int col;
    private int row;
    private char[][] box;

    TranspositionKeyEncrypt(String text, String key) {
        this.text = text;
        this.key = key.toCharArray();
        col = (int)Math.ceil((double)text.length() / (double)this.key.length) + 1;
        row = this.key.length;
        box = new char[col][row];
    }
    public void encrypt() {
        fillBoxEncrypt();
        sortKey();
        sortBox();
    }

    private void fillBoxEncrypt() {
        for (int i = 0; i != row; ++i)
            box[0][i] = key[i];

        for(int i = 0, temp = 0; i != row; ++i) {
            for(int j = 1; j != col; ++j) {
                if(temp < text.length()) {
                    box[j][i] = text.charAt(temp);
                    temp++;
                } else {
                    box[j][i] = ' ';
                }
            }
        }
    }

    private void sortKey() {
        for (int i = 0; i != key.length; ++i)
            for (int j = 0; j != key.length - i - 1; ++j) {
                if (key[j] > key[j + 1]) {
                    char temp = key[j];
                    key[j] = key[j + 1];
                    key[j + 1] = temp;
                }
            }
    }

    private void sortBox() {
        for (int i = 0; i != row; ++i)
            for (int j = 0; j != row; ++j) {
                if (key[i] == box[0][j]) {
                    for (int k = 0; k != col; ++k) {
                        char temp = box[k][j];
                        box[k][j] = box[k][i];
                        box[k][i] = temp;
                    }
                }
            }
    }

    public void printBox() {
        for (int i = 1; i != col; ++i) {
            System.out.print(box[i]);
        }
        System.out.println();
    }
}
