
public class SequentialSearch implements SearchStrategy {

	@Override
	public int search(Comparable[] array, Comparable target) {
		int output = -1;
		boolean searchFlag = false; //�٥����A�Хܬ�false
		for(int i = 0 ; i < array.length && !searchFlag ; i++)
		{
			if(array[i].compareTo(target) == Comparable.SAME)
			{
				output = i;
				searchFlag = true;
			}
		}
		if(!searchFlag)
		{
			System.out.println("�å����\���Ӹ�ơA�^��-1");
		}
		return output;
	}

}
