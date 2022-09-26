package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;
        while (i <= printToInclusive) {
            System.out.println(factorial(i));
            i++;
        }
    }

    private int factorial(int i) {
        int p = 1;
        int j = 1;
        if (i == 0) {
            return 1;
        } else {
            while (j <= i) {
                p *= j;
                j++;
            }
        }
        return p;
    }
}
