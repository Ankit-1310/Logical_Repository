
public class Prime {
	public int count(int i1, int num, int counter) {
		
		if (i1 > 1) {
			if (num % i1 == 0) {
				return count(--i1, num, ++counter);
			}
			return count(--i1, num, counter);
		}
		return counter;
	}

	public void prime(int range) {
		if (range >= 0) {
			int num = range;
			if (count(range, num, 0) == 1)
				System.out.print(num+ " ");
			prime(range-1);
		}
	}

	public static void main(String[] args) {
		new Prime().prime(100);
	}

}
