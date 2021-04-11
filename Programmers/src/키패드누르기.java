import java.util.Arrays;
import java.util.HashMap;

public class Ű�е崩���� {

	public static void main(String[] args) {
		int[] numbers = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
		String hand = "right";
		System.out.print(solution(numbers, hand));
	}

	public static String solution(int[] numbers, String hand) {
		String answer = "";
		String[] result = new String[numbers.length];
		// �޼� ��ġ array
		String[] left = new String[numbers.length + 1];
		// ������ ��ġ array
		String[] right = new String[numbers.length + 1];

		int[][] distance = { {0,0}, {0,1}, {0,2}, 
							{1,0}, {1,1}, {1,2},
							{2,0}, {2,1}, {2,2},
							{3,0}, {3,1}, {3,3} };

		left[0] = "*";
		right[0] = "#";
		for (int i = 0; i < numbers.length; i++) {
			// ���� ��
			if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				result[i] = "L";
				// ������ ��
			} else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				result[i] = "R";
				
				
			}else if (numbers[i] == 2 || numbers[i] == 5 || numbers[i] == 8 || numbers[i] == 0) {
				
				// �޼� �Ÿ�
				System.out.println("���� : " + numbers[i]);
				System.out.println("���� : " + left[i]);
				System.out.println("���� : " + right[i]);
				
				int l_distance = (Math.abs(numbers[i]-Integer.parseInt(left[i]))) ;
				// ������ �Ÿ�
				int r_distance = (Math.abs(Integer.parseInt(right[i])-numbers[i]));
				
				System.out.println("�ޱ��� " + l_distance);
				System.out.println("������ : " + r_distance);
				System.out.println("=========");
				if (l_distance > r_distance) {
					result[i] = "R";
				} else if (l_distance < r_distance) {
					result[i] = "L";
				} else if (l_distance == r_distance) {
					if (hand.equals("right")) {
						result[i] = "R";
					} else {
						result[i] = "L";
					}
				}
		
			}
			if(result[i] == "R") {
				left[i + 1] = left[i];
				right[i + 1] = Integer.toString(numbers[i]);
			}else {
				left[i + 1] = Integer.toString(numbers[i]);
				right[i + 1] = right[i];
			}
			
		}
		System.out.println(Arrays.toString(left));
		System.out.println(Arrays.toString(right));
		System.out.println(Arrays.toString(result));

		

		return answer;
	}


}