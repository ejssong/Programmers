import java.util.ArrayList;
import java.util.Arrays;

public class �ּҰ������ {

	public static void main(String[] args) {
		int[]A = {1,4,2};
		int[]B = {5,4,4};
		System.out.print(solution(A,B));
	}
	public static int solution(int []A, int []B){
		int answer = 0;
        //A,B �������� ����
        Arrays.sort(A);
        Arrays.sort(B);
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < A.length; i++) {
        	answer += A[i] * B[B.length-1-i];
        	System.out.println(A[i] * B[B.length-1-i]);
        }
        System.out.println(answer);
        return answer;
    }

}
