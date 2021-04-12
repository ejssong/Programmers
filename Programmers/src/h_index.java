public class h_index {

	public static void main(String[] args) {
		int[] citation = {3, 0, 6, 1, 5};
		System.out.print(solution(citation));

	}

	public static int solution(int[] citations) {
		int answer = 0;
		//Arrays.sort(citations);
		int publication = 0;
		int reference = 0;
		//Max value 찾기 
		int max = citations[0];
		for (int i = 0; i < citations.length; i++) {
			if (citations[i] > max) {
				max = citations[i];

			}
		}

		for (int i = 0; i < max; i++) {
			if (i <= citations[i]) {
				answer = citations[i];
				break;
			}
		}

		return answer;

	}

}
