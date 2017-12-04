package utils;
public class ArrayUtils {

	static int[] reverse (int[] arr){
	
		int[] rev = new int[arr.length];
		
		for (int k=0;k<arr.length; k++){
			rev[k] = arr[arr.length-1-k];
		}
		return rev;
	}
	



	static String stringifyArray (int[] array){
		String output = "" + array[0];
		for(int i = 1; i<array.length;i++){
			output += "," + array[i];
		}
		return output;
	}
}
