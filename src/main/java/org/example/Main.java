package org.example;
import Cars.Car;

import java.math.BigDecimal;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    static void main(String[] args) throws IOException{
        BigDecimal bd = new BigDecimal("1.623");
        System.out.printf("Rounding BigDecimal to hundreth: %f\nReversing it's sign and rounding BigDecimal to tenth %f\n", BigDecimalOperations.roundToHundreth(bd), BigDecimalOperations.reverseSignAndRoundToTenth(bd));

    }
}
