

public class 괄호변환 {

	public static void main(String[] args) {
		String p = "()))((()";
		System.out.println(solution(p));
	}
	
	public static String solution(String p) {
        return makeCorrect(p);
    }
	private static String makeCorrect (String p) {
		//1. 입력이 빈 문자열인 경우, 빈 문자열 반환 
        if (p.length() == 0) {
        	return "";
        }
        //2. 문자열 w를 두 "균형잡힌 괄호 문자열" u, v로 분리합니다.
        //단, u는 "균형잡힌 괄호 문자열"로 더 이상 분리할 수 없어야 하며, 
        //v는 빈 문자열이 될 수 있습니다. 
        int cut = division(p);
        String u = p.substring(0,cut);
        String v = p.substring(cut, p.length());
        //3. 문자열 u가 "올바른 괄호 문자열" 이라면 문자열 v에 대해 1단계부터 다시 수행합니다. 
        if(isCorrect(u)) {
        	return u + makeCorrect(v);
        }else {
        	String temp = "(" + makeCorrect(v) + ")";
        	u = u.substring(1,u.length()-1);
        	u = reverse(u);
        	return temp + u;		
        }
		
	}
	private static String reverse(String u) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < u.length(); i++) {
			if(u.charAt(i) == ')') {
				sb.append('(');
			}else {
				sb.append(')');
			}
			
		}
		return sb.toString();
	}

	private static boolean isCorrect(String u) {
		int cnt = 0; 
		
		for(int i = 0; i < u.length(); i++) {
			if(u.charAt(i) == '(') {
				cnt++;
			}else {
				cnt--;
			}
			
			if(cnt < 0) {
				return false;
			}
		}
		return true;
	}

	private static int division(String p) {
		int cnt = 0;
		
		for(int i = 0; i < p.length(); i++) {
			if(p.charAt(i) == '(') {
				cnt ++;
			}else {
				cnt--;
			}
			if(cnt == 0) {
				return i + 1;
			}
			
		}
		return -1;
	}

}
