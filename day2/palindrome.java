package week1.day2;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=34343;
int reversedNum=0;
int remainder;

int originalNum=num;
while(num !=0)
{
	remainder=num % 10;
	reversedNum=reversedNum * 10 + remainder;
	num/=10;
	}
if (originalNum==reversedNum)
{
	System.out.println(originalNum+ " is palindrome.");
}
else
{
	System.out.println(originalNum+ " is not a palindrome.");
	
}
	}

}
