import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class openchat {

	public static void main(String[] args) {
		String[] record = { "Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo",
				"Change uid4567 Ryan" };
		System.out.print(Arrays.toString(solution(record)));

	}

	private static String[] solution(String[] record) {
		int len = 0;
		for (String s : record) {
			if (!s.contains("Change"))
				len++;
		}

		String[] answer = new String[len];
		HashMap<Integer, String> usrList = new HashMap<>();
		for (String s : record) {
			String[] buf = s.split(" ");
			if (buf[0].equals("Enter") || buf[0].equals("Change")) {
				setUser(buf, usrList);
			}
		}

		int index = 0;
		for (int i = 0; i < record.length; i++) {
			String[] buf = record[i].split(" ");
			if (buf[0].equals("Enter")) {
				answer[index] = usrList.get(getId(buf[1])) + "님이 들어왔습니다.";
				index++;
			} else if (buf[0].equals("Leave")) {
				answer[index] = usrList.get(getId(buf[1])) + "님이 나갔습니다.";
				index++;
			}
		}

		return answer;
	}

	private static Integer getId(String id) {
		return Integer.parseInt(id.substring(3));
	}

	private static void changeNickName(String[] buf, Map<Integer, String> usrList) {
		Integer id = getId(buf[1]);
		usrList.put(id, buf[2]);
	}

	private static void setUser(String[] buf, Map<Integer, String> usrList) {
		Integer id = getId(buf[1]);
		if (usrList.containsKey(id)) {
			changeNickName(buf, usrList);
		} else {
			usrList.put(id, buf[2]);
		}
	}

}
