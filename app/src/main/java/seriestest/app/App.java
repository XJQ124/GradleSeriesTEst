package seriestest.app;

public class App {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("请提供数列类型和数列长度作为命令行参数！");
            System.out.println("使用方式：java seriestest.app.App <数列类型> <数列长度>");
            return;
        }

        int sequenceType = Integer.parseInt(args[0]);
        int length = Integer.parseInt(args[1]);

        Sequence sequence;
        if (sequenceType == 1) {
            sequence = new FibonacciSequence();
        } else if (sequenceType == 2) {
            sequence = new ArithmeticSequence();
        } else if (sequenceType == 3) {
            sequence = new PrimeSequence();
        } else {
            System.out.println("无效的数列类型");
            return;
        }

        int[] result = sequence.generate(length);
        System.out.println("生成的数列为：");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
