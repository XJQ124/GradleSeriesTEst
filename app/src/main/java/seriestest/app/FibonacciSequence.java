package seriestest.app;

public class FibonacciSequence implements Sequence {
    @Override
    public int[] generate(int length) {
        int[] sequence = new int[length];
        sequence[0] = 0;
        if (length > 1) {
            sequence[1] = 1;
            for (int i = 2; i < length; i++) {
                sequence[i] = sequence[i - 1] + sequence[i - 2];
            }
        }
        return sequence;
    }
}
    
