import java.util.*;

class Demo {
	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int[] nums = {5, 3, 2, 3,5,1,1,2, 6};
		
		for(int i=0; i<nums.length; i++) {
			if(!hm.containsKey(nums[i])) {
				hm.put(nums[i], 1);
			}else{
				hm.put(nums[i], 2);
			}
		}

		for(int i=0; i<nums.length; i++) {
			if(hm.get(nums[i]) == 1) {
				System.out.println(nums[i]);
			}
		}
		System.out.println(hm);	
	}
}
