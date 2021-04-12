import java.util.Arrays;

public class 땅따먹기 {

	public static void main(String[] args) {
		int[][] land = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };
		System.out.print(solution(land));
	}

	private static int solution(int[][] land) {
		int answer = 0;
		int[] result = new int[land.length];
		int temp = 0; 
		for (int i = 0; i < land[0].length; i++) { // 열
			
			if(temp < land[0][i]) {
				temp = land[0][i];
			}
			result[0] = temp;

		}
		System.out.println(land[2][0]);
		System.out.println(Arrays.toString(result) + " ");

		return answer;
	}

}
