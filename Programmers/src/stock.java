import java.util.Arrays;

public class stock {

	public static void main(String[] args) {
		int[] prices = { 5, 8, 6, 2, 4, 1 };
		System.out.print(solution(prices));
	}

	public static int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		int cnt;
		for (int i = 0; i < prices.length; i++) {
			cnt = 0;
			for (int j = i +1 ; j < prices.length ; j++) {
				
				if(prices[i] <= prices[j]) {
					cnt++;
		
				}else {
					cnt++;
					break;
				}

			}
			answer[i] = cnt;
		}
		System.out.print(Arrays.toString(answer));
		return answer;
	}

}
