public interface SortStrategy {
	public void sort(Comparable[] input);
	public Comparable[] getSortResult(Comparable[] input);
	public String getScanTime();
}
