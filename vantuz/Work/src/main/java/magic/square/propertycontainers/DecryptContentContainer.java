package magic.square.propertycontainers;

import util.data.types.CharSetSquareMatrix;

import java.util.Map;

public class DecryptContentContainer {
    private CharSetSquareMatrix decryptedMessage;
    private Map<Integer, Integer> mapMagicSquare;

    public DecryptContentContainer(Map<Integer, Integer> matrix, CharSetSquareMatrix message) {
        this.mapMagicSquare = matrix;
        this.decryptedMessage = message;
    }

    public CharSetSquareMatrix getDecryptedMessage() {
        return decryptedMessage;
    }
    public Map<Integer, Integer> getMapMagicSquare() {
        return mapMagicSquare;
    }
}
