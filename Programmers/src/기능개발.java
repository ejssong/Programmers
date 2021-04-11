
import java.util.Arrays;
import java.util.LinkedList;

public class ��ɰ��� {

	public static void main(String[] args) {
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		System.out.println(solution(progresses, speeds));
	}
	public static int[] solution(int[] progresses, int[] speeds) {
		int time ;
		int[] time_array = new int[progresses.length];
		LinkedList<int[]> list = new LinkedList<>();
		int max = 0;
		//�ð� ���ϱ� 
		for(int i = 0; i < progresses.length ; i++) {
			time = (100 - progresses[i])/speeds[i];
			//������ �������� �ʴ� �ٸ� 1 �߰�
			if( (100 - progresses[i]) % speeds[i] != 0) {
				time += 1;
			}
			time_array[i] = time;
					
		}
		
		for(int i = 0; i < progresses.length ; i++) {
			if(time_array[i] > max ) {
				max = time_array[i];
				list.add(new int[] {1});
			}else {
				list.getLast()[0]++;
			}
		}
	
		//���� ��� �迭 
		int[] answer = new int[list.size()];

		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i)[0];
		}
		System.out.println(Arrays.toString(answer));
        return answer;
    }

}
