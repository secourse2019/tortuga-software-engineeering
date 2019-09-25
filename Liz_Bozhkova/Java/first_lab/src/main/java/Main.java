import magic.square.propertycontainers.DecryptContentContainer;
import magic.square.propertycontainers.EncryptContentContainer;
import magic.square.methods.MagicSquareDecrypt;
import magic.square.methods.MagicSquareEncrypt;
import util.data.types.CharSetSquareMatrix;

public class Main {
    public static void main(String[] args) {
        String text = "abcdefghij";

        EncryptContentContainer cont = new EncryptContentContainer(text);
        MagicSquareEncrypt squareEncrypt = new MagicSquareEncrypt();

        squareEncrypt.setContent(cont);

        CharSetSquareMatrix matr = squareEncrypt.getEncryptedMessage();

        DecryptContentContainer decryptContent = new DecryptContentContainer(cont.getMapMagicSquare(), matr);
        MagicSquareDecrypt decrypt = new MagicSquareDecrypt();
        decrypt.setContent(decryptContent);
        System.out.println(decrypt.getDecryptedMessage());
    }
}
