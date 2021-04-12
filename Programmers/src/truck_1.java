import java.util.LinkedList;
import java.util.Queue;

public class truck_1 {

	public static void main(String[] args) {
		int bridge_length = 100;
		int weight = 100;
		int[] truck_weights = { 10 };
		System.out.print(solution(bridge_length, weight, truck_weights));

	}

	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;

		// 트럭 추가할 큐 생성하기
		Queue<Integer> queue = new LinkedList<>();

		// 트럭 도착할 시간 추가할 큐 생성하기
		Queue<Integer> goal = new LinkedList<>();
		
		
		return answer;
	}

}
