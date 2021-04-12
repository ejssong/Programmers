import java.util.Arrays;
import java.util.Stack;

public class color {

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
				
				if(picture[i][j] > 0 && visit[i][j] == false) {
					X.add(i);
					Y.add(j);
					visit[i][j] = true;
					answer[0] += 1;
					
				}
				
				while(!X.isEmpty() && !Y.isEmpty()) {
					int x = X.pop();
					int y = Y.pop();
					
					//위쪽 비교 
					if(x > 0 && picture[i][j] == picture[x-1][y]) {
						X.add(i);
						X.add(j);
						visit[x-1][y] = true;
						answer[0]++;
					}
					//아래 비교 
					if(x > 0 && picture[i][j] == picture[x+1][y]) {
						X.add(i);
						X.add(j);
						visit[x+1][y] = true;
						answer[0]++;
					}
					
					//좌 
					if(y < m-1 && picture[i][j] == picture[x][y-1]) {
						X.add(i);
						X.add(j);
						visit[x][y-1] = true;
						answer[0]++;
					}
					//우 
					if(x > 0 && picture[i][j] == picture[x][y+1]) {
						X.add(i);
						X.add(j);
						visit[x][y+1] = true;
						answer[0]++;
					}
					
				}
				
				
				
				
				
				
			}
			System.out.println("");
		}
		
		
		return answer;

	}

}
