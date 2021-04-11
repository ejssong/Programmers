import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class truck {

	public static void main(String[] args) {
		int bridge_length = 2; 
		int weight = 10;
		int[] truck_weights = {7,4,5,6};
		System.out.println(solution(bridge_length, weight, truck_weights));

	}

	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		//다리를 건너는 트럭 
		Queue<Integer> cross = new LinkedList<>();
		for(int i = 0; i < truck_weights.length; i++) {
			 cross.add(truck_weights[i]);
			//cross.remove() // 값제거 
			 //cross.offer() //값 추가 
			 answer += bridge_length;
		}
		
		return answer;
	}

}
