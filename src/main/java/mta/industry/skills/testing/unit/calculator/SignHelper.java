package mta.industry.skills.testing.unit.calculator;

public class SignHelper {

    int fixSign(Operation op, int first, int second, int intermediateResult) {
        int finalResult = intermediateResult;
        switch (op) {
            case TIMES:
            case DIVIDE:
                if ( (first < 0 && second < 0) ||
                        (first > 0 && second > 0) ) {
                    finalResult = Math.abs(finalResult);
                }
        }

        return finalResult;
    }
}
