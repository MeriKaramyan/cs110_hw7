package utils;
public class Math{

	static int factorial (int num)
	{
		if (num <= 1){
			return 1;
		} else {
			return num * factorial (num-1);  
		}
	
	}


	static int factorialLoop (int num){
		int result = 1;
		for(int i=2;i<=num;i++){
			result*=i;
		}
		
		return result;
	}
}
