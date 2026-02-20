package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {
    public static double roundToHundreth(BigDecimal bd) {
        if (bd == null) {
            throw new IllegalArgumentException("Input can't be null!");
        }
        return bd.setScale(2, RoundingMode.HALF_DOWN).doubleValue();
    }

    public static double reverseSignAndRoundToTenth(BigDecimal bd) {
        if (bd == null) {
            throw new IllegalArgumentException("Input can't be null!");
        }
        return bd.negate().setScale(1, RoundingMode.HALF_UP).doubleValue();
    }
}
