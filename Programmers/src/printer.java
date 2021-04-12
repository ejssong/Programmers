import java.util.HashMap;

public class printer {

	public static void main(String[] args) {
		int[] priorities = { 1, 1, 9, 1, 1, 1 };
		int location = 0;
		System.out.print(solution(priorities, location));
	}

	public static int solution(int[] priorities, int location) {
		int answer = 0;
		HashMap<Integer, Integer> map = new HashMap<>();

		// map에 값 넣기
		for (int i = 0; i < priorities.length; i++) {
			map.put(i, priorities[i]);
		}
		int temp = map.get(0);
		
		map.forEach((key, value)-> {
			if (temp < value ) {
			
			}
		});
		System.out.print(map);
		return answer;
	}

}
