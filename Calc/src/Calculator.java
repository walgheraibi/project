import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		double result=0,firstInput=0, secontInput =0;
		Calc calc = new Calc();
		int chioce = 0;
		String choiceYorN = "y";
		Scanner keyboard = new Scanner(System.in);
		while(choiceYorN.equalsIgnoreCase("y"))
		{
		System.out.println("What is the the first number? : ");
		firstInput=keyboard.nextDouble();
		keyboard.nextLine();
		System.out.println(" 1 - Addition \n 2 - Subtraction \n 3 - Multiplication \n 4 - Division \n 5 - Modulus");
		System.out.println("What do you want to do? : ");
		chioce= keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("What is the the second number? : ");
		secontInput=keyboard.nextDouble();
		keyboard.nextLine();
		switch(chioce){
		case 1: result = calc.addition(firstInput, secontInput);
		break;
		case 2: result = calc.subtraction(firstInput, secontInput);
		break;
		case 3: result = calc.multiplication(firstInput, secontInput);
		break;
		case 4: result = calc.division(firstInput, secontInput);
		break;
		case 5: result = calc.modulus(firstInput, secontInput);
		break;
		}
		System.out.println("Result : " + result);
		System.out.println("countinue? (y/n) ");
			choiceYorN = keyboard.next();
			keyboard.nextLine();
			System.out.println();
			}
		keyboard.close();
	}	

}
