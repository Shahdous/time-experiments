public class DuplicationAlg2 extends Duplication{
    
    public DuplicationAlg2(int arraySizeIn, int maxValueIn){
        super(arraySizeIn, maxValueIn);
    }

    public boolean containsDuplicate(){

        boolean[] lookup = new boolean[maxValue];

        for (int i = 0; i < arraySize; i++){

            if(lookup[array[i]] == true){
                return true;
            } else{
                lookup[array[i]] = true;
            }
        }
        return false;
    }
}
