import java.util.ArrayList;

public class 스킬트리 {

	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA",""};
		System.out.println(solution(skill, skill_trees));


	}

	public static int solution(String skill, String[] skill_trees) {
		int answer = 0;
		int cnt = 0;
		boolean a = true;
		ArrayList<String> skills = new ArrayList<>();
		for(int i = 0; i <skill.length(); i++) {
			skills.add(Character.toString(skill.charAt(i)));
		}
		
		for (int i = 0; i < skill_trees.length; i++) {
			String[] st_array = skill_trees[i].split("");
			for (int j = 0; j <  st_array.length ; j++) {
				//cnt => 첫번째 부터 확인 하고 존재하면 count
				if(skills.get(cnt).equals(st_array[j])) {
					cnt++;
				}else if(!skills.get(cnt).equals(st_array[j]) && skills.contains(st_array[j])) {
					a = false;
					break;
				}
				//skills와 같은게 아예 없거나 1개 or 다 일치
//				if(cnt == skills.size() || j == st_array.length-1) {
//					answer++;
//					cnt = 0; 
//					break;
//				}	
			}
			if(a) {
				answer++;
				cnt = 0; 
				break;
			}
			
			

		}
		
		
		return answer;
	}

}
