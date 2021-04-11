import java.util.ArrayList;
import java.util.Arrays;

public class 최소값만들기 {

	public static void main(String[] args) {
		int[]A = {1,4,2};
		int[]B = {5,4,4};
		System.out.print(solution(A,B));
	}
	public static int solution(int []A, int []B){
		int answer = 0;
        //A,B 오름차순 정렬
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
