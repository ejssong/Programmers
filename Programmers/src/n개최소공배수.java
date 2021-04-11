
public class n개최소공배수 {

	public static void main(String[] args) {
		int[] arr = { 2, 6, 8, 14 };
		System.out.println(solution(arr));
	}

	public static int solution(int[] arr) {
		int answer = 0;
		int max = arr[0];
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}

		}
		for (int j = 1; j < max; j++) {
			for (int i = 0; i < arr.length; i++) {
				
				if (arr[i] % j == 0) {
					num = j;
					break;
				}
			}
		}
		System.out.println(num);
		System.out.println(max);
		return answer;
	}

}
