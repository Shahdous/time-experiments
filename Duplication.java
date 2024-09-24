import java.util.Random;
/**
	Examining various approaches for checking an int array for 
	duplicate values. The various approaches have different 
	"Big Oh" behaviour.
	
*/
public abstract class Duplication
{
	protected int[] array;
	protected int arraySize;
	protected int minValue;
	protected int maxValue;

	public Duplication(int arraySizeIn, int maxValueIn)
	{	arraySize = arraySizeIn;
		array = new int[arraySize];
		minValue = 0;
		maxValue = maxValueIn;
		fillArray();
	}

	private void fillArray()
	{	Random r = new Random();
		for (int i=0; i< array.length; i++)
			array[i] = r.nextInt(maxValue);
	}

	public abstract boolean containsDuplicate();

	public void displayArray()
	{	for (int i=0; i< array.length; i++)
			System.out.println(i + "\t" + array[i]);

	}

	public void createDuplicate()
	{	if (array.length <= 1)
			return;
		Random r = new Random();
		int index1 = r.nextInt(array.length);
		int index2;
		do {index2 = r.nextInt(array.length);}
			while (index1 == index2);
		array[index1] = array[index2];
	}
	
}
