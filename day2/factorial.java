package week1.day2;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int factorial=1;
		for(int i=1;i<=num;i++)
		{
			factorial*=i;
		}
System.out.println("Factorial of 5 is " + factorial);
	}

}
