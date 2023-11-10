package org.example;

import java.util.logging.Logger;

public class CalculateSum {

    private static final Logger logger = Logger.getLogger(CalculateSum.class.getName());
    int num;
    private static final Logger logger = Logger.getLogger(CalculateSum.class.getName());

    public CalculateSum(int n){
        num = calculateSumFunction(n);
    }

    public int getNum() {
        return num;
    }

    public static int calculateSumFunction(int n) {

        return 0;/*<<<---- TODO: Remove this line of code, and:
                TODO: - create a variable that will store the value
                TODO: - make a loop that adds each number between the number and 0
                TODO: - return the variable (the total)
       */

    }
}
