
public class Calculator {

	public static int addition(int num1,int num2)
	{
		return  num1+num2;
	}
	
	public static int multiplication(int num1,int num2)
	{
		return num1*num2;
	}
	
	public static int substraction(int num1,int num2)
	{
		return num1-num2;
	}
	public static int module(int num1,int num2)
	{
		return num1%num2;
	}
	public static void main(String arg[])
	{
		int num1,num2;
		num1=10;num2=30;
		System.out.println("Addition : "+Calculator.addition(num1, num2));
		System.out.println("Multiplication : "+Calculator.multiplication(num1, num2));
		System.out.println("Substraction : "+Calculator.multiplication(num1, num2));
		System.out.println("Num1 % Num2 = "+Calculator.module(num1, num2));
	}
}
