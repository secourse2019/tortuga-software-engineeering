package simple.transposition;

import util.callables.FillArrayByRow;
import util.GetMessageByColumn;
import util.Util;

public class SimpleTransposition {
    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        int len = Util.promoteLength(message.length());
        char[][] box = new char[len][len];
        Util.fillBox(message, box, new FillArrayByRow());
        return Util.getResultFromMatrix(box, len, len, new GetMessageByColumn());
    }

    private String message;
}
