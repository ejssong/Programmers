import java.util.*;

public class Q16_�������ڴ½Ⱦ� {

	public static void main(String[] args) {
		int[] arr = {4,4,4,3,3};
		System.out.println(Arrays.toString(solution(arr)));
	}

	public static int[] solution(int[] arr) {
		int[] answer = {};
		ArrayList<Integer> array = new ArrayList<Integer>();

		array.add(arr[0]);
		for(int i = 0; i < arr.length - 1; i++) {
			//arraylist�ȿ� ������ �� �߰� 
			if(arr[i] != arr[i+1]) {
				array.add(arr[i]);
				
			}
		
		}
		answer = new int[array.size()];
		
		for(int i = 0; i < answer.length; i++) {
			answer[i] = array.get(i);
		}

		return answer;
	}

}
