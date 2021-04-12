import java.util.Arrays;
import java.util.Stack;

public class 컬러링북 {

	public static void main(String[] args) {
		int m = 6;
		int n = 4;
		int[][] picture = {{1,1,1,0}, {1,2,2,0}, {1,0,0,1}, {0,0,0,1}, {0,0,0,3}, {0,0,0,3}};
		System.out.print(Arrays.toString(solution(m,n,picture)));
	}
	
	public static int[] solution(int m, int n, int[][] picture) {
		int numberOfArea = 0;
		int maxSizeOfOneArea = 0;

		int[] answer = new int[2];
		
		//영역 개수 
		answer[0] = numberOfArea;
		//가장 넒은 영역 
		answer[1] = maxSizeOfOneArea;
		
		//탐색시간 줄이기 위해서 탐색 유무 정하기 
		boolean[][] visit = new boolean[m][n];
		
		//X, Y 좌표 
		Stack<Integer> X = new Stack<>();
		Stack<Integer> Y = new Stack<>();
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(picture[i][j]);
				int cnt = 0; 
				//0인곳 제외 & 탐색한 곳 제외 
				if(picture[i][j] > 0 && visit[i][j] == false ) {
					X.add(j);
					Y.add(i);
					//탐색한 곳으로 바꿔주기
					visit[i][j] = true;
					cnt++;
					//영역 개수 카운트 
					answer[0]++;
				}
				
				//영역 (상하좌우) 에 같은 색상이 존재하면 반복 
				while(!X.isEmpty()) {
					
					int x = X.pop();
					int y = Y.pop();
					
					//좌표 위 
					if(y > 0 && picture[y-1][x] == picture[i][j] && visit[y-1][x] == false ) {
						X.add(x);
						Y.add(y-1);
						visit[y-1][x] =true;
						cnt ++; 
						
					}
					//좌표 기준 왼쪽 
					if(x > 0 && picture[y][x-1] == picture[i][j] && visit[y][x-1] == false ) {
						X.add(x-1);
						Y.add(y);
						visit[y][x-1] =true;
						cnt ++; 
						
					}
					//좌표 기준 아래 
					if(y < m - 1 && picture[y+1][x] == picture[i][j] && visit[y+1][x] == false ) {
						X.add(x);
						Y.add(y+1);
						visit[y+1][x] =true;
						cnt ++; 
						
					}
					//좌표 기준 오른쪽
					if(x < n - 1 && picture[y][x+1] == picture[i][j] && visit[y][x+1] == false ) {
						X.add(x+1);
						Y.add(y);
						visit[y][x+1] =true;
						cnt ++; 
						
					}

				}
				
				answer[1] = Math.max(answer[1], cnt);
		
				
			}
		}
		
		
		return answer;

	}

}
