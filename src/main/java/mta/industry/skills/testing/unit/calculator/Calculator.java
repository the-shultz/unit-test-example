package mta.industry.skills.testing.unit.calculator;

public class Calculator {

    public int add(int x, int y) {
        return x + y;
    }

    public int minus(int x, int y) {
        return x - y;
    }

    public int times(int x, int y) {
        int result = 0;
        for (int i=0; i<y; i++) {
            result += x;
        }
        return result;
    }









    /*public int times(int x, int y) {
        int result = 0;
        for (int i=0; i<Math.abs(y); i++) {
            result += x;
        }
        return result;
    }*/

    public int divide(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("You cannot divide by 0 !");
        }

        return x/y;
    }
}
