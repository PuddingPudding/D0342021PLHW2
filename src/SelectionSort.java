
public class SelectionSort implements SortStrategy {

	int totalTimes = 0;
	@Override
	public void sort(Comparable[] input) 
	{		
		boolean switchFlag = true; //�b�o�@���ˬd���A�O�_���X�{�洫���ʧ@
		for(int i = 0 ;i < input.length && switchFlag ; i++)
		{
			switchFlag = false;
			for(int j = i+1 ; j < input.length ; j++)
			{
				totalTimes++;
				if(input[i].compareTo(input[j]) == Comparable.BIGGER)
				{
					Comparable temp = input[i];
					input[i] = input[j];
					input[j] = temp;
					switchFlag = true;
				}
			}
		}
		System.out.println("��ܱƧǪk�����y����: " + totalTimes);
		totalTimes = 0;
	}

	@Override
	public Comparable[] getSortResult(Comparable[] input) 
	{
		Comparable[] output = input.clone();
		this.sort(output);
		return output;
	}

}
