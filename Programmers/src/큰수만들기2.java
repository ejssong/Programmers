import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ū�������2 {

	public static void main(String[] args) {
		String number = "4177252841";
		int k = 4;
		System.out.println(solution(number, k));
	}

	public static String solution(String number, int k) {
		//k -> ������ �� 
		//number.length - k = �̾ƾ� �� �� 
		//k �� 4��� �� �� 4�ڸ��� ������ ���ڿ� �κп��� ���� ū ���� ã�� 
		StringBuilder answer = new StringBuilder();
		String[] num = number.split("");
		ArrayList<String> array = new ArrayList<String>();
		char max;
		int start = 0;
		int comp = 0;
		for(int i = 0; i < number.length()- k ; i++) {
			comp = 0;
			for(int j = start; j < i+k; j++ ) {
				if(comp < number.charAt(j) - '0'){
                    comp = number.charAt(j) - '0';
                    start = j+1;
                    array.add(i, String.valueOf(number.charAt(i)));
                    //result[i] = num[j];
                }
			}
			answer.append(comp);
		}
		
		System.out.println(array);
		return answer.toString();
	}

}
