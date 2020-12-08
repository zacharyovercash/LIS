package increasing;

import java.util.ArrayList;
import java.util.Random;

public class IncreasingSubsequence {

	public static void main(String[] args) {

		int[] initial = new int[50];
		int[] tempArray = new int[initial.length];

		Random rand = new Random();
		for (int i = 0; i < initial.length; i++) {
			initial[i] = rand.nextInt(10);
		}

		ArrayList<Integer> sub = new ArrayList<Integer>();
		int compare;
		ArrayList<ArrayList> al = new ArrayList<ArrayList>();
		for (int i = 0; i < initial.length; i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j <= i; j++) {
				if (initial[j] < initial[i]) {
					compare = tempArray[j] + 1;
					if (compare > tempArray[i]) {
						tempArray[i] = compare;
						list.add(initial[j]);

					}

				}

			}
			list.add(initial[i]);
			al.add(list);
		}
		int max = tempArray[0];
		int location = 0;
		for (int i = 0; i < tempArray.length; i++) {
			if (tempArray[i] > max) {
				max = tempArray[i];
				location = i;
			}
		}
		System.out.println("longest subsequence is " + (max + 1));
		for (ArrayList<Integer> o : al) {

			if (o.size() == max + 1) {
				System.out.println(o);
			}
		}
	}

}
