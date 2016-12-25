public interface Comparable 
{
	public static final int ERROR = -2;
	public static final int SMALLER = -1;
	public static final int SAME = 0;
	public static final int BIGGER = 1;
	public int compareTo(Comparable input);
	public String toString();
}
