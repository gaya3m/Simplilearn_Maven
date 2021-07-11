package tdd;

public class PrimeNumberCheck {
	public static boolean isPrime(int num) {
		int temp;
		boolean flag =true;
		
		for(int i =2; i<=num/2;i++)
		{
			temp=num%i;
			if(temp==0)
			{
				flag=false;
				break;
			}
		}
		
		return flag;
	}


	
}
