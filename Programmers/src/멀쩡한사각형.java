
public class 멀쩡한사각형 {

	public static void main(String[] args) {
		int w = 8;
		int h = 12;
		System.out.print(solution(w,h));
	}
	public static long solution(long w, long h) {

        long whole = w * h;
        long result = w + h - gcd(w,h);
        return whole - result;
    }
	public static long gcd(long a, long b) {
		while( b != 0) {
			long temp = a % b; 
			a = b;
			b = temp; 
		}
		return a;
	}

}
