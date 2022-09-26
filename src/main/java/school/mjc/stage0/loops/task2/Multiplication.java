package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = 0;
        while (multiplyByAndToInclusive != 0 && i <= Math.abs(multiplyByAndToInclusive)) {
            System.out.println(i * multiplyByAndToInclusive);
            i++;
        }
    }
}
