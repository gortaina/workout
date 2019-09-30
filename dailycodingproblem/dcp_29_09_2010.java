import java.util.Arrays;


public class dcp_29_09_2010 {

	/*
	 * This problem was asked by Uber.
	 * 
	 * Given an array of integers, return a new array such that each element at
	 * index i of the new array is the product of all the numbers in the
	 * original array except the one at i.
	 * 
	 * For example, if our input was [1, 2, 3, 4, 5], the expected output would
	 * be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output
	 * would be [2, 3, 6].
	 * 
	 * Follow-up: what if you can't use division?
	 */

	public static void main(String[] args) {
		dcp_29_09_2010 cl1 = new dcp_29_09_2010();
		cl1.init();
		System.out.println("END RunTime");
	}

	public void init() {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 3, 2, 1 };
		this.dcp(a);
		this.dcp(b);
	}

	public int[] dcp(int[] a) {
		int[] fat1 = Arrays.copyOf(a, a.length);
		System.out.println(Arrays.toString(a));
     
		for (int i = 0; i < fat1.length; i++) {
			fat1[i]= fatorial(a, a.length - 1, i);			
		}
		System.out.println(Arrays.toString(fat1));
		return null;// copy;
	}



	public int fatorial(int[] a, int index, int step) {
		if (index == 0) {
			return a[index];
		} else {
			if(index == step){
				return fatorial(a, index-1, step++);					
			}else{
				return a[index]*fatorial(a, index-1, step++);
			}
		}
	}

}
