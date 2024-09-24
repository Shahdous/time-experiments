public class DuplicationAlg3 extends Duplication{
    
    public DuplicationAlg3(int arraySizeIn, int maxValueIn){
        super(arraySizeIn, maxValueIn);
    }
    public boolean containsDuplicate(){

        int[] sortedArray = new int[arraySize];
        for(int i = 0; i < sortedArray.length; i++){
            sortedArray[i] = array[i];
        }
        java.util.Arrays.sort(sortedArray);

        for(int i = 0; i < sortedArray.length - 1; i++){
            if(sortedArray[i] == sortedArray[i+1]){
                return true;
            }
        }
        return false;
    }

}