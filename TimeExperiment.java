public class TimeExperiment {


    public static long timeAlgorithm(Duplication algo) {
        long startTime = System.nanoTime();
        algo.containsDuplicate();
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static void main(String[] args) {

        int sizes[] = {100, 500, 1000, 5000, 10000, 20000};
        int maxValue = 100000;

        System.out.println("Timing Algorithm 1a:");
        timeExperiment1a(sizes, maxValue);

        System.out.println("Timing Algorithm 1b:");
        timeExperiment1b(sizes, maxValue);

        System.out.println("Timing Algorithm 2:");
        timeExperiment2(sizes, maxValue);

        System.out.println("Timing Algorithm 3:");
        timeExperiment3(sizes, maxValue);

        System.out.println("Timing Algorithm 4:");
        timeExperiment4(sizes, maxValue);
    }

    public static void timeExperiment1a(int sizes[], int maxValue) {
        for (int i = 0; i < sizes.length; i++) {
            int size = sizes[i];
            DuplicationAlg1a algo = new DuplicationAlg1a(size, maxValue);
            long timeTaken = timeAlgorithm(algo);
            System.out.println("Size: " + size + ", Time: " + timeTaken + " ns");
        }
    }

    public static void timeExperiment1b(int sizes[], int maxValue) {
        for (int i = 0; i < sizes.length; i++) {
            int size = sizes[i];
            DuplicationAlg1b algo = new DuplicationAlg1b(size, maxValue);
            long timeTaken = timeAlgorithm(algo);
            System.out.println("Size: " + size + ", Time: " + timeTaken + " ns");
        }
    }

    public static void timeExperiment2(int sizes[], int maxValue) {
        // Constant M, varying N
        int constantM = 10000;
        for (int i = 0; i < sizes.length; i++) {
            int size = sizes[i];
            DuplicationAlg2 algo = new DuplicationAlg2(size, constantM);
            long timeTaken = timeAlgorithm(algo);
            System.out.println("Size: " + size + ", Time: " + timeTaken + " ns");
        }

        // Constant N, varying M
        int constantN = 10000;
        int lookupSizes[] = {1000, 5000, 10000, 50000, 100000};
        for (int i = 0; i < lookupSizes.length; i++) {
            int lookupSize = lookupSizes[i];
            DuplicationAlg2 algo = new DuplicationAlg2(constantN, lookupSize);
            long timeTaken = timeAlgorithm(algo);
            System.out.println("Lookup Size: " + lookupSize + ", Time: " + timeTaken + " ns");
        }
    }

    public static void timeExperiment3(int sizes[], int maxValue) {
        for (int i = 0; i < sizes.length; i++) {
            int size = sizes[i];
            DuplicationAlg3 algo = new DuplicationAlg3(size, maxValue);
            long timeTaken = timeAlgorithm(algo);
            System.out.println("Size: " + size + ", Time: " + timeTaken + " ns");
        }
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
