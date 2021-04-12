import java.util.LinkedList;
import java.util.Queue;

public class truck {

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

		// 큐에 트럭 추가하기
		for (int i = 0; i < truck_weights.length; i++) {
			queue.add(truck_weights[i]);
		}

		// 건너고 있는 트럭 무게
		int pass = 0;
		// 건넌 트럭 인덱스
		int cnt = 0;
		// 마지막 트럭의 도착시간
		int last = 0;
		// 대기 트럭이 없을때까지 반복하기
		while (true) {
			// 1초 단위마다 일어나는 일 정해주기
			answer++;

			// 다리를 건너고 있는 트럭이 없다면 트럭 보내기
			if (pass == 0) {
				pass += queue.poll();
				goal.add(bridge_length + answer);
				continue;
			}

			// 더 보낼 트럭이 없으면 answer = answer + (마지막 도착시간 - answer) 하고 종료
			if (queue.isEmpty()) {
				while (!goal.isEmpty()) {
					last = goal.poll();
				}
				answer = answer + (last - answer);
				break;
			}

			// 건너던 트럭이 도착할 시간 되면 도착한 트럭의 무게 삭제
			if (answer == goal.peek()) {
				goal.remove();
				pass -= truck_weights[cnt];
				cnt++;
			}

			// 다리 무게가 견딜때까지 트럭 추가
			if ((pass + queue.peek()) <= weight) {
				pass += queue.poll();
				goal.add(bridge_length + answer);
				continue;
			}

		}

		return answer;
	}

}
