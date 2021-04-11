import java.util.ArrayList;
import java.util.Arrays;

public class 크레인인형뽑기 {

	public static void main(String[] args) {
		int[][] board = { { 0, 0, 1, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 2, 1, 0, 0 }, { 0, 2, 1, 0, 0 },
				{ 0, 2, 1, 0, 0 } };
		int[] moves = { 1, 2, 3, 3, 2, 3, 1 };

		System.out.println(solution(board, moves));

	}

	public static int solution(int[][] board, int[] moves) {
		int answer = 0;

		int[][] array = new int[board.length][board.length];
		ArrayList<Integer> result = new ArrayList<Integer>();

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				array[i][j] = board[j][i];
				//System.out.print(array[i][j] + "\t");
			}
			//System.out.println("\n");

		}

		for (int i = 0; i < moves.length; i++) {
			for (int k = 0; k < array.length; k++) {
				if (array[moves[i] - 1][k] == 0) {
					continue;
				} else {
					result.add(array[moves[i] - 1][k]);
					array[moves[i] - 1][k] = 0;
					break;

				}
				
			}

		}
		/*
		System.out.println(result);
		System.out.println("\n");
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println("\n");

		}
		*/
		
		for (int i = 0; i < result.size() - 1; i++) {
			if (result.get(i) == result.get(i + 1)) {
				result.remove(i + 1);
				result.remove(i);
				i = -1;
				answer += 2;
				
			}
			

		}
		
	
		return answer;
	}
}
