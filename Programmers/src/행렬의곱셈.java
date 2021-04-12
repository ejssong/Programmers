import java.util.Arrays;

public class 행렬의곱셈 {

	public static void main(String[] args) {	
		int[][] arr1 = {{1,4},{3,2},{4,1}};
		int[][] arr2 = {{3,3},{3,3}};
		System.out.print(Arrays.toString(solution(arr1,arr2)));
	}

	public static int[][] solution(int[][] arr1, int[][] arr2) {
		 System.out.println(arr1[0][0]);
        int[][] answer = new int[arr1[0].length][arr2[0].length];
        for(int i = 0; i < arr1[0].length ; i++) {
        	for(int j = 0; j < arr2[0].length ; j++){
        		answer[i][j] = arr1[0][i] * arr2[0][j];
        		System.out.println(answer[i][j]);
        	}
        }
       
         return answer;
    }
}
