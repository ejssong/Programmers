
public class 최댓값과최솟값 {

	public static void main(String[] args) {
		String s = "1 2 3 4";
		System.out.print(solution(s));
	}
	public static String solution(String s) {
		String b = "";
        int[] result = new int[2];
        String[] array = s.split(" ");
        int max =  Integer.parseInt(array[0]);
        int min =  Integer.parseInt(array[0]);
  
        for(int i = 0; i < array.length; i++ ) {
        	int a = Integer.parseInt(array[i]);
        	if(a > max) {
        		max = a;
        	}
        	if(a < min) {
        		min = a;
        	}
        	result[0] = min;
        	result[1] = max;
        	b = min + " " + max;
        }
        
        return b;
    }

}
