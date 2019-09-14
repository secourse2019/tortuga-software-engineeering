package com.company.simple;

import com.company.util.FillArrayByRow;
import com.company.util.GetMessageByColumn;
import com.company.util.Util;

public class Simple {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        int length = Util.makeLength(message.length());
        char[][] box = new char[length][length];
        Util.fillEncodeBox(message, box, new FillArrayByRow());
        return Util.getResultFromMatrix(box, length, length, new GetMessageByColumn());
    }
}
