package magic.square.methods;

import magic.square.propertycontainers.DecryptContentContainer;

public class MagicSquareDecrypt {
    private DecryptContentContainer content;
    private int size;

    public void setContent(DecryptContentContainer content) {
        this.size = content.getDecryptedMessage().getSize();
        this.content = content;
    }

    public String getDecryptedMessage() {
        StringBuilder resultBuilder = new StringBuilder();

        for (int i = 0; i < content.getMapMagicSquare().size(); ++i) {
            int order = content.getMapMagicSquare().get(i);
            resultBuilder.append(content.getDecryptedMessage().getByOrder(order));
        }

        return resultBuilder.toString();
    }
}
