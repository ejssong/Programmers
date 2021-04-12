
import java.util.ArrayList;


public class 캐시 {
	public static void main(String[] args) {
		int cacheSize = 0;
		String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
		System.out.print(solution(cacheSize, cities));
	}

	public static int solution(int cacheSize, String[] cities) {
		ArrayList<String> cache = new ArrayList<>();
		int answer = 0;
		
		if (cacheSize == 0) {//캐시 사이즈가 0이면, 배열 길이*5로 반환
            answer = cities.length*5;
            return answer;
        }
 
		for (int i = 0; i < cities.length; i++) {
			String city = cities[i];

			// cache안에 city가 존재할 때 (HIT = 1)
			if (cache.contains(city)) {
				cache.remove(city);
				cache.add(city);
				answer += 1;
			} else {
				// cache안에 city가 존재하지 않을 때 (HIT = 5)
				if (cache.size() < cacheSize) {
					cache.add(city);
					answer += 5;
				} else  {
					cache.remove(0);
					cache.add(city);
					answer += 5;

				}
			}

		}
		
		System.out.print(cache.toString());

		return answer;
	}
}