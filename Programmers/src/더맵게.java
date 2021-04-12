import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 더맵게 {

	public static void main(String[] args) {
		int[] scoville = {10,10,10,10,10};
		int K = 100;
		System.out.print(solution(scoville, K));
	}

	public static int solution(int[] scoville, int K) {
		int answer = 0;
		// scoville 지수
		int degree = 0;
		// 가진 음식의 스코빌 지수
		//Arrays.sort(scoville);
		Queue<Integer> array = new LinkedList<>();
		for (int i = 0; i < scoville.length; i++) {
			array.add(scoville[i]);
		}
		int first = array.peek();
		int cnt = 0;

		for (int k = 0; k < scoville.length; k++) {
		
			for (int i = k; i < array.size() - 1; i++) {
				
				int temp = array.poll();
				int second = array.poll();
				if (first > second) {
					temp = first;
					first = second;
					second = temp;
				}
				degree = first + (second * 2);
				System.out.println("첫번째 번호 " + first);
				System.out.println("두번째 번호  " + second);
				System.out.println("degree " + degree);
				array.clear();
				array.add(degree);
				cnt++;
				if (array.peek() >= K) {
					answer = cnt;
				
				}else {
					// 2개씩 scoville에 더해주니까 i + 2
					for (int j = i+1; j < scoville.length; j++) {
						array.add(scoville[j]);
						
					}
					System.out.println(array);
					// K보다 degree가 크므로 첫번째 인덱스 지우기
					first = array.peek();

					System.out.println("a : " + first);
					System.out.println("======");
					array.remove();
					
					
				}
				
				
			}
			
			
		}

		if(degree < K) {
			return -1;
		}

		System.out.println(array);
		return answer;
	}

}
