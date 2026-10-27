// To find the factorial of a given number
import java.util.Scanner;

class Factorial{
	public static int factorial(int num){
		if(num == 0 || num == 1){
			return 1;
		}
		return num * Factorial.factorial(num-1);
	}
}
class Question2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int number = sc.nextInt();
		int result = Factorial.factorial(number);
		System.out.println("Factorial of "+number+" = "+result);
	}
}