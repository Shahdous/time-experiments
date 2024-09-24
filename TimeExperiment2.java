public class TimeExperiment2 {

    public static long timeAlgorithm(Duplication algo) {
        long startTime = System.nanoTime();
        algo.containsDuplicate();
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static void main(String[] args) {
        int sizes[] = {100, 500, 1000, 5000, 10000, 20000};
        int maxValue = 100000;

        System.out.println("Timing Algorithm 2 (Varying N, Constant M):");
        timeExperiment2VaryN(sizes, maxValue);

        System.out.println("Timing Algorithm 2 (Varying M, Constant N):");
        timeExperiment2VaryM(maxValue);
    }

    public static void timeExperiment2VaryN(int sizes[], int maxValue) {
        int constantM = 10000;
        for (int i = 0; i < sizes.length; i++) {
            int size = sizes[i];
            DuplicationAlg2 algo = new DuplicationAlg2(size, constantM);
            long timeTaken = timeAlgorithm(algo);
            System.out.println("Size: " + size + ", Time: " + timeTaken + " ns");
        }
    }

    public static void timeExperiment2VaryM(int maxValue) {
        int constantN = 10000;
        int lookupSizes[] = {1000, 5000, 10000, 50000, 100000};
        for (int i = 0; i < lookupSizes.length; i++) {
            int lookupSize = lookupSizes[i];
            DuplicationAlg2 algo = new DuplicationAlg2(constantN, lookupSize);
            long timeTaken = timeAlgorithm(algo);
            System.out.println("Lookup Size: " + lookupSize + ", Time: " + timeTaken + " ns");
        }
    }
}
