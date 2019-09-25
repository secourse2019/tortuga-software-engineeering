package magic.square.methods;

import magic.square.propertycontainers.EncryptContentContainer;
import util.data.types.CharSetSquareMatrix;

import java.util.Map;

public class MagicSquareEncrypt {
    private EncryptContentContainer content;
    private CharSetSquareMatrix encryptedMessage;

    public void setContent(EncryptContentContainer content) {
        int side = content.getSide();
        this.content = content;
        this.encryptedMessage = new CharSetSquareMatrix(side);
    }

    public CharSetSquareMatrix getEncryptedMessage() {
        int len = content.getText().length();

        for (int i = 0; i < len; ++i) {
            int order = content.getMapMagicSquare().get(i);
            encryptedMessage.insert(content.getText().charAt(i), order);
        }

        return encryptedMessage;
    }

    public Map<Integer, Integer> getKey() {
        return content.getMapMagicSquare();
    }
}