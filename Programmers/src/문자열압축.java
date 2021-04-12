
public class 문자열압축 {

	public static void main(String[] args) {
		String s = "xababcdcdababcdcd";
		System.out.print(solution(s));
	}
	public static int solution(String s) {
        int answer = 0;
      
        StringBuilder compressed = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
        	answer++;
        	
        	if( i + 1 >= s.length() || s.charAt(i) != s.charAt(i+1)) {
        		if(answer != 1) {
        			compressed.append(answer);
        		}
        	
        		compressed.append(s.charAt(i));
        		
        		answer = 0;
        	}
        }
        System.out.println("compressed " + compressed.toString());
    	return compressed.length();
//        if(compressed.length() < s.length()) {
//        	System.out.println("compressed " + compressed.toString());
//        	return compressed.length();
//        }else {
//        	System.out.println("s : " + s);
//        	return s.length();
//        }
        
    }

}
