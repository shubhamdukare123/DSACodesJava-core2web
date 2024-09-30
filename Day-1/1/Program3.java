

class Demo {
	public static void main(String[] args) {
		int[] nums = new int[]{4,2,1, 4,9, 2,1};
		int retValue = 0;
		for(int i=0; i<nums.length; i++) {
			retValue ^= nums[i];
		}

		System.out.println(retValue);
		
	}
}
