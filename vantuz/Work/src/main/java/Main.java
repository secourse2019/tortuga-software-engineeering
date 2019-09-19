import transpositionwithkey.Encoder;
import transpositionwithkey.propertycontainers.ContentContainer;

public class Main {
    public static void main(String[] args) {
        String text = "first message, rost lox";
        String key = "icq1";

        ContentContainer container = new ContentContainer(text, key);
        Encoder encoder = new Encoder(container);

        encoder.encodeMessage();

        System.out.println(encoder.getEncodedMessage());
    }
}
