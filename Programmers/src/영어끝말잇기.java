
import java.util.Arrays;

public class 영어끝말잇기 {

	public static void main(String[] args) {
		int n = 2;
		String[] words = { "hello", "one", "even", "never", "now", "world", "draw" };
		System.out.print(Arrays.toString(solution(n, words)));

	}

	public static int[] solution(int n, String[] words) {
		//번호 , 차례 
		int[] answer = new int[2];
		int index_num = 0;
		int a = 0;
		for (int i = 0; i < words.length; i++) {
			// 같은 단어 말할 때 탈락자
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					answer[0] = j % n + 1;
					answer[1] = j / n + 1;
					a = 1; 
					break;
				}
			}
			// 한글자 일 때 탈락 
			if (words[i].length() == 1) {
				index_num = i + 1;

				if (index_num % n == 0) {
					answer[0] = n;
				} else {
					answer[0] = index_num % n;
				}
				answer[1] = (n % index_num);
			}

		}
		// 끝 글자가 같지 않을 때 탈락자
		for (int i = 0; i < words.length - 1; i++) {
			if (words[i].charAt(words[i].length() - 1) != words[i + 1].charAt(0)) {
				int number = (i + 1) % n + 1;
				int order = (i + 1) / n + 1;
				
				//가장 먼저 탈락하는 사람 번호 
				if( a == 1) {
			
					return answer;
					
				}else {
					answer[0] = number; 
					answer[1] = order;
					return answer;
				}

			}
		}

		return answer;
	}

}
