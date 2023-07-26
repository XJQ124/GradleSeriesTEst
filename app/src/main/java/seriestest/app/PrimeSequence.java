package seriestest.app;


public class PrimeSequence implements Sequence {
    @Override
    public int[] generate(int length) {
        int[] sequence = new int[length];
        int count = 0;
        int number = 2;
        while (count < length) {
            if (isPrime(number)) {
                sequence[count] = number;
                count++;
            }
            number++;
        }
        return sequence;
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}