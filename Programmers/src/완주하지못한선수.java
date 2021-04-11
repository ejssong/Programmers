import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class 완주하지못한선수 {

	public static void main(String[] args) {
		String[] participant = { "mislav", "stanko", "mislav", "ana" };
		String[] completion = { "stanko", "ana", "mislav" };
		System.out.println(solution(participant, completion));

		int[] arr = { 5, 9, 7, 10 };
		int divisor = 5;
	}

	public static String solution(String[] participant, String[] completion) {
		String answer = "";
	
		for (int i = 0; i < completion.length; i++) {
			for (int j = 0; j < participant.length; j++) {
				if (completion[i].equals(participant[j])) {
					participant[j] = "";
					break;
				}
			}
		}

		for(int i = 0; i < participant.length; i++) {
			answer += participant[i];
		}

		return answer;
	}

}
