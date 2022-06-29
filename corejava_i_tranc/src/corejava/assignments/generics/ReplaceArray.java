package corejava.assignments.generics;

public class ReplaceArray {

	static void swap(int[] k, int j, int l) {

		int t = k[j];
		k[j] = k[l];
		k[l] = t;
		for (int i = 0; i < k.length; i++)
			System.out.print(k[i]);
		System.out.println();

	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		swap(a, 0, 2);
		swap(a, 0, 2);
		swap(a, 0, 2);
		swap(a, 0, 2);

	}

}