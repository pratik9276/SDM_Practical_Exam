
public class Calculator {

	public static int addition(int num1,int num2)
	{
		return  num1+num2;
	}
	
	public static int multiplication(int num1,int num2)
	{
		return num1*num2;
	}
	
	public static void main(String arg[])
	{
		int num1,num2;
		num1=10;num2=30;
		System.out.println("Addition Of Two Number : "+Calculator.addition(num1, num2));
		System.out.println("Multiplication Of Two Number : "+Calculator.multiplication(num1, num2));
	}
}
