package transpositionwithkey;

import transpositionwithkey.propertycontainers.ContentContainer;
import util.GetMessageByRow;
import util.Util;

public class Encoder {
    private ContentContainer content;

    public Encoder(ContentContainer content) {
        this.content = content;
    }

    public void encodeMessage() {
        sortMatrixColumns(0, content.getColumnsCount() - 1);
    }

    public String getEncodedMessage() {
        return Util.getResultFromMatrix(content.getMessage().getMessage(), content.getColumnsCount(), content.getRowsCount(), new GetMessageByRow());
    }

    private void sortMatrixColumns(int left, int right) {
        if (left < right) {
            int pivot = partition(left, right);

            if (pivot > 1) {
                sortMatrixColumns(left, pivot - 1);
            }
            if (pivot + 1 < right) {
                sortMatrixColumns(pivot + 1, right);
            }
        }
    }

    private int partition(int left, int right) {
        int pivot = content.dictKey.get(left).symbolCode;

        while (true) {
            while (content.dictKey.get(left).symbolCode < pivot) {
                ++left;
            }
            while (content.dictKey.get(right).symbolCode > pivot) {
                --right;
            }

            if (left < right) {
                if (content.dictKey.get(left).symbolCode == content.dictKey.get(right).symbolCode) return right;

                content.swapColumnsInMessage(left, right);
                content.swapPairsInDickKey(left, right);
            } else {
                return right;
            }
        }
    }

    public ContentContainer getContent() {
        return content;
    }
}
