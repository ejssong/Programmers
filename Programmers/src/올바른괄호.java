import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class 올바른괄호 {

	public static void main(String[] args) {
		String s = "()()";
		String s1 = "(())()";
		String s2 = ")()(";
		String s3 = "(()(";
		String s4 = "()))((()";
	
		System.out.println(solution(s));
		
		System.out.println(solution(s1));
		System.out.println(solution(s2)); 
		System.out.println(solution(s3));
		System.out.println(solution(s4));
		/*
		 * 
		 * 
		 * 
		 */

	}

	static boolean solution(String s) {
		boolean answer = true;
		/*
		String[] list  = s.split("");
		ArrayList<String> array = new ArrayList<String>(Arrays.asList(list));

		for (int i = 0; i < array.size() -1 ; i++) {
			if (array.get(i).equals("(") && array.get(i+1).equals(")")) {
				array.remove(i+1);
				array.remove(i);
				i = -1;
			}
		}
		System.out.println(array);
		if(array.isEmpty()) {
			return true; 
		}
		 */
	
		//String[] list  = s.split("");
		//ArrayList<String> array = new ArrayList<String>(Arrays.asList(list));
		Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
		
	}

}
