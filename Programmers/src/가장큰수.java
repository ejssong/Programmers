
import java.util.Arrays;

public class 가장큰수 {

	public static void main(String[] args) {
		int[] numbers = {3, 30, 34, 5, 9};
		System.out.print(solution(numbers));
	}

	public static String solution(int[] numbers) {
		String answer = "";
		String[] num = new String[numbers.length];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = Integer.toString(numbers[i]);
			
		}
		
		Arrays.sort(num, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
		System.out.print(Arrays.toString(num));
		if(num[0].equals("0")) {
			answer += "0";
		}else {
			for(int j = 0; j < num.length; j++) {
				answer += num[j];
			}
		}
		return answer;
	}

}
