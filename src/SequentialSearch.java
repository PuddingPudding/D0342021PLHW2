
public class SequentialSearch implements SearchStrategy {

	@Override
	public int search(Comparable[] array, Comparable target) {
		int output = -1;
		boolean searchFlag = false; //還未找到，標示為false
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
			System.out.println("並未成功找到該資料，回傳-1");
		}
		return output;
	}

}
