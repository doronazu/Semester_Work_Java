import java.util.Scanner;

public class start {

	public static void main(String[] args) {
		calculator c = new calculator(4, 7);
		planet p = new planet(4,7);
		double firstNumber , secondNum,num1,x1=0,memo1=0,memo2=0,memo3=0,memo4=0;
		int counter=0,i=1;
		
	while(i>0){
		c.calculatorPrint();
		if(counter>=2)
			System.out.println("Press 6 - CREATE A NEW PLANET");
		
		Scanner scan=new Scanner(System.in);
		num1=scan.nextInt();
		
		if(num1==1){
			System.out.println("You have chosen ADDITION!");
			System.out.println("Enter a number:");
			firstNumber=scan.nextInt();
			System.out.println("+");
			secondNum=scan.nextInt();
			x1=c.Addition(firstNumber, secondNum);
			System.out.println("= "+x1);
		}
		
		if(num1==2){
			System.out.println("You have chosen SUBTRACTION!");
			System.out.println("Enter a number:");
			firstNumber=scan.nextInt();
			System.out.println("-");
			secondNum=scan.nextInt();
			x1=c.subtraction(firstNumber, secondNum);
			System.out.println("= "+x1);
		}
		
		if(num1==3){
			System.out.println("You have chosen MULTIPLICATION!");
			System.out.println("Enter a number:");
			firstNumber=scan.nextInt();
			System.out.println("*");
			secondNum=scan.nextInt();
			x1=c.Multiplication(firstNumber, secondNum);
			System.out.println("= "+x1);
		}
			
		if(num1==4){
			System.out.println("You have chosen POWER!");
			System.out.println("Enter a number:");
			firstNumber=scan.nextInt();
			System.out.println("^");
			secondNum=scan.nextInt();
			x1=c.power(firstNumber, secondNum);
			System.out.println("= "+x1);
		}
		
		if(num1==5){
			System.out.println("FIND IF PRIME?");
			System.out.println("Enter a number:");
			firstNumber=scan.nextInt();
			c.prime(firstNumber);
			x1 = firstNumber;
		}
		
		
		
		if(num1==6){
			System.out.println("CREATE YOURE PLANET:");
			System.out.println("Select a number from memory, It would be the weight of your planet in Megaton");
			if(memo1 != 0 )
				System.out.println("Press 1 to use Memory 1 - "+memo1);
			if(memo2 != 0 )
				System.out.println("Press 2 to use Memory 2 - "+memo2);
			if(memo3 != 0 )
				System.out.println("Press 3 to use Memory 3 - "+memo3);
			if(memo4 != 0 )
				System.out.println("Press 4 to use Memory 4 - "+memo4);
			firstNumber=scan.nextInt();
			
			if(firstNumber==1)
				firstNumber=memo1;
			if(firstNumber==2)
				firstNumber=memo2;
			if(firstNumber==3)
				firstNumber=memo3;
			if(firstNumber==4)
				firstNumber=memo4;
			
			System.out.println("Select one more number from memory, It would be the distance of your planet from the sun in Kilometers");
			if(memo1 != 0 )
				System.out.println("Press 1 [Memory 1] - "+memo1);
			if(memo2 != 0 )
				System.out.println("Press 2 [Memory 2] - "+memo2);
			if(memo3 != 0 )
				System.out.println("Press 3 [Memory 3] - "+memo3);
			if(memo4 != 0 )
				System.out.println("Press 4 [Memory 4] - "+memo4);
			secondNum=scan.nextInt();
			
			if(secondNum==1)
				secondNum=memo1;
			if(secondNum==2)
				secondNum=memo2;
			if(secondNum==3)
				secondNum=memo3;
			if(secondNum==4)
				secondNum=memo4;
			
			p.cratePlanet(firstNumber, secondNum);
	        break;
		}
	
		
		
		c.calculatorSave();
		
		num1=scan.nextInt();
		
		if(num1==0){
			System.out.println("Your Rezult Don't save.");
		}
		
		if(num1==1){
			memo1=x1;
			counter++;
			System.out.println("Your Rezult saved in Memory 1.");
		}
			
		if(num1==2){
			memo2=x1;
			counter++;
			System.out.println("Your Rezult saved in Memory 2.");
		}
			
		if(num1==3){
			memo3=x1;
			counter++;
			System.out.println("Your Rezult saved in Memory 3.");
		}
			
		if(num1==4){
			memo4=x1;
			counter++;
			System.out.println("Your Rezult saved in Memory 4.");
		}
		
		
		}
	}
}
