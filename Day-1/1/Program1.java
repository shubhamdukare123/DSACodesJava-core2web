
class Demo {
	public static void main(String[] args) {
		int[] arr = {4,4,2,1,2};

		for(int i=0; i<arr.length; i++) {
			boolean elemFound = false;
			for(int j=0; j<arr.length; j++) {
				if(i == j) {
					continue;
				}

				if(arr[i] == arr[j]) {
					elemFound = true;
					break;
				}
			}

			if(elemFound == false) {
				System.out.println(arr[i]);
			}
		}
	}
}
