import java.util.Scanner;

public class Comparator{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter another number: ");
	int secondNumber = input.nextInt();

		if(firstNumber == secondNumber){
			System.out.print("0");
		}
		else if(firstNumber > secondNumber){
			System.out.print("1");
		}
		else if(secondNumber > firstNumber){
			System.out.print("-1");
		}

	}



}