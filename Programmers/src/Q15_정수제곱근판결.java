
public class Q15_�����������ǰ� {

	public static void main(String[] args) {
		long n = 3;
		System.out.println(solution(n));
	}
	
	public static double solution(long n) {
        long answer = 0;
        double num = n;
        if(Math.sqrt(n) % 1 == 0) {
        	answer = (long) Math.sqrt(n);
        	num = (answer + 1);
        	answer = (long) (num * num);
        }else {
        	answer = -1;
        }
        
        return answer;
    }

}
