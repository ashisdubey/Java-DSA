public class TestApp {
	
	public static int[] processArray(int[] givenArray) {
		
		/*Program for Given an integer array nums, 
		move all 0's to the end of it while maintaining the relative order of 
		the non-zero elements.
		*/
		
		/*
			Time Complexity = O(n)
			Space Complexity = O(1)
		*/
		for(int i=0,insPosition=0;i<givenArray.length;i++) {
			if(givenArray[i] == 0) {
				continue;
			}else {
				givenArray[insPosition++] = givenArray[i];
				givenArray[i] = 0;
			}
		}
		
		return givenArray;
		
	}
	
	public static void main(String[] args) {
		int[] givenArray = new int[]{0,1,0,3,12};
		int[] result= processArray(givenArray);
		
		//Displaying the processed result
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+"\t");
		}
		
	}

}
