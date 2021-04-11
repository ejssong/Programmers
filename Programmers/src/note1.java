
public class note1 {

	public static void main(String[] args) {

		int[] arr = {10};

		for (int i = 0; i < arr.length; i++) {
			System.out.print(solution(arr)[i] + "\t");
		}

	}

	public static int[] solution(int[] arr) {
		int[] answer = {};
		
		
		if (arr.length >= 2 ) {
			int min = answer[0];
			for(int i = 0; i < arr.length; i++) {
				
				if(min > arr[i]) {
					min = arr[i];
				
				}
			}
		}else {
			answer[0] = -1;
		}
		
		return answer;

	}
}
