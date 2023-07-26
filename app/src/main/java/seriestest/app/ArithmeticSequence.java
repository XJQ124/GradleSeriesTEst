package seriestest.app;


public class ArithmeticSequence  implements Sequence {
   
    @Override
    public int[] generate(int length) {
        int[] sequence = new int[length];
        sequence[0] = 0;
        int commonDifference = 3; // 设置等差数列的公差，这里假设为3
        for (int i = 1; i < length; i++) {
            sequence[i] = sequence[i - 1] + commonDifference;
        }
        return sequence;
    }
}

