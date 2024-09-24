public class DuplicationAlg1a extends Duplication{
    
    public DuplicationAlg1a(int arraySizeIn, int maxValueIn){
        super(arraySizeIn, maxValueIn);
    }

    public boolean containsDuplicate() {
        for (int i = 0; i < arraySize; i++) {
            for (int j = i + 1; j < arraySize; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}