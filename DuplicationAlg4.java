public class DuplicationAlg4 extends Duplication {

    public DuplicationAlg4(int arraySizeIn, int maxValueIn) {
        super(arraySizeIn, maxValueIn);
    }

    public boolean containsDuplicate() {

        BinaryTree tree = new BinaryTree();
        boolean isTrue = false;
        
        for (int i = 0; i < arraySize; i++) {
            try {
                tree.insert(array[i]);
            } catch (IllegalArgumentException e) {
                isTrue = true;
                return isTrue;
            }
        }
        return false;
    }
}
