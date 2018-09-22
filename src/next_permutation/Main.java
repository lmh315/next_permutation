package next_permutation;

public class Main {
	public static boolean next_permutation(int[] arr) {

		int i = arr.length - 1;
		while (i > 0 && arr[i - 1] >= arr[i]) {
			i--;
		}
		if (i <= 0)
			return false;

		int j = arr.length - 1;
		while (arr[j] <= arr[i - 1]) {
			j--;
		}

		int temp = arr[i - 1];
		arr[i - 1] = arr[j];
		arr[j] = temp;

		j = arr.length - 1;

		while (i < j) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		return true;
	}
}
