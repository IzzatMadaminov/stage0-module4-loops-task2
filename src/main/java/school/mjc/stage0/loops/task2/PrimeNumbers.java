package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 0;
        while (i <= printToInclusive) {
            if (isPrime(i))
                System.out.println(i);
            i++;
        }
    }

    private boolean isPrime(int i) {
        if (i < 2) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i % 2 == 0)
            return false;
        for (int j = 3; j * j <= i; j += 2) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
