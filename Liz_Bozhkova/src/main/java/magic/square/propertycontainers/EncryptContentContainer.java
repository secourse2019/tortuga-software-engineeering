package magic.square.propertycontainers;

import magic.square.MagicSquareCreator;
import util.Util;

import java.util.Map;

public class EncryptContentContainer {
    private String text;
    private Map<Integer, Integer> mapMagicSquare;
    private int side;

    public EncryptContentContainer(String text) {
        this.text = text;
        this.side = Util.promoteLength(text.length());
        if (this.side % 2 == 0) {
            ++this.side;
        }
        mapMagicSquare = MagicSquareCreator.generateMagicSquareAsMap(side);
    }

    public String getText() {
        return text;
    }
    public int getSide() {
        return  side;
    }
    public Map<Integer, Integer> getMapMagicSquare() {
        return mapMagicSquare;
    }
}
