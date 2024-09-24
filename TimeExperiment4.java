public class TimeExperiment4 {

    public static long timeAlgorithm(Duplication algo) {
        long startTime = System.nanoTime();
        algo.containsDuplicate();
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static void main(String[] args) {
        int sizes[] = {100, 500, 1000, 5000, 10000, 20000};
        int maxValue = 100000;

        System.out.println("Timing Algorithm 4:");
        timeExperiment4(sizes, maxValue);
    }

    public static void timeExperiment4(int sizes[], int maxValue) {
        for (int i = 0; i < sizes.length; i++) {
            int size = sizes[i];
            DuplicationAlg4 algo = new DuplicationAlg4(size, maxValue);
            long timeTaken = timeAlgorithm(algo);
            System.out.println("Size: " + size + ", Time: " + timeTaken + " ns");
        }
    }
}
