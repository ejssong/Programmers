import java.util.ArrayList;

public class ÆùÄÏ¸ó {

	public static void main(String[] args) {
		int[] nums = {3, 3, 3, 2, 2, 2};
		System.out.println(solution(nums));
	}
	public static int solution(int[] nums) {
        int answer = 0;
        int select = nums.length /2;
        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int i = 0; i< nums.length; i++) {
        	if(!array.contains(nums[i])) {
        		array.add(nums[i]);
       
        	}else {
        		continue;
        	}
        }
        System.out.println(array);
        if(select < array.size()) {
        	return select;
        }else {
        	return array.size();
        }
        
        //return array.size();
    }
}
