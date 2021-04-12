import java.util.ArrayList;
import java.util.Stack;

public class 짝지어제거하기 {

	public static void main(String[] args) {
		String s = "baabaa";
		System.out.print(solution(s));
	}

	public static int solutions(String s) {
		ArrayList<String> array = new ArrayList<String>();

		for (int i = 0; i < s.length(); i++) {
			array.add(s.charAt(i) + "");

		}

		for (int i = 0; i < array.size() - 1; i++) {
			if (array.get(i).equals(array.get(i + 1))) {
				array.remove(i + 1);
				array.remove(i);
				i = -1;
			}
		}
		if (array.size() == 0) {
			return 1;
		} else {
			return 0;
		}

	}

	public static int solution(String s) {
		Stack<String> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (!stack.isEmpty() && stack.peek() == Character.toString(s.charAt(i))) {
				stack.pop();
			} else {
				stack.push(Character.toString(s.charAt(i)));
			}
		}
		if (stack.isEmpty()) {
			return 1;
		} else {
			return 0;
		}

	}

}
