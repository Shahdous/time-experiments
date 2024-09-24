public class TimeExperiment3 {

    public static long timeAlgorithm(Duplication algo) {
        long startTime = System.nanoTime();
        algo.containsDuplicate();
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static void main(String[] args) {
        int sizes[] = {100, 500, 1000, 5000, 10000, 20000};
        int maxValue = 100000;

        System.out.println("Timing Algorithm 3:");
        timeExperiment3(sizes, maxValue);
    }

    public static void timeExperiment3(int sizes[], int maxValue) {
        for (int i = 0; i < sizes.length; i++) {
            int size = sizes[i];
            DuplicationAlg3 algo = new DuplicationAlg3(size, maxValue);
            long timeTaken = timeAlgorithm(algo);
            System.out.println("Size: " + size + ", Time: " + timeTaken + " ns");
        }
    }
}
