public class DuplicationAlg1b extends Duplication{
    
    public DuplicationAlg1b(int arraySizeIn, int maxValueIn){
        super(arraySizeIn, maxValueIn);
    }

    public boolean containsDuplicate() {
        boolean duplicateFound = false;

        for (int i = 0; i < arraySize; i++) {
            for (int j = i + 1; j < arraySize; j++) {
                if (array[i] == array[j]) {
                    duplicateFound = true;
                }
            }
        }
        return duplicateFound;
    }
}