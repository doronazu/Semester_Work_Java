import java.util.Scanner;

public class Calculator {
	//////////////////////////////////////////////////////////////////////////////////
	//																				//
    //   This class contains calculator functions to perform arithmetic operations	//
	//   Adding numbers																//
	//   Subtraction																//
	//   multiplication																//
   	//   strong																		//
	//   Find if a prime number														//
	//   Each function has a unique Algoritim */									//
	//																				//
	//////////////////////////////////////////////////////////////////////////////////
	
	/*Defines SIX magic numbers for the options*/									
	
	public static final int OPTION_QUIT = 0;
	public static final int OPTION_ONE = 1;
	public static final int OPTION_TWO = 2;
	public static final int OPTION_TREE = 3;
	public static final int OPTION_FOUR = 4;
	public static final int OPTION_FIVE = 5;
	public static final int OPTION_SIX = 6;
	
	//////////////////////////////////////////////////////////////////////////////////////////////
	//*				   			List of variables												//
	//*  																						//
	//*																							//
    //*   		 action = the option the user chose to do in the calculator						//
	//*		planetSaves = the number of planet the user save									//
	//*		numberSaves = the number of results from the calculator the user save				//
	//*		firstNumber = the first number the user enter to the calculator function			//
	//*  	  secondNum = the second number the user enter to the calculator function			//
	//*	 		 result = the results from the function after the math							//
	//*			memory1 = the user can use this box for save the result from the calculator		//
	//*			memory2 = the user can use this box for save the result from the calculator		//
	//*			memory3 = the user can use this box for save the result from the calculator		//
	//*			memory4 = the user can use this box for save the result from the calculator 	//
	//*/////////////////////////////////////////////////////////////////////////////////////////// 

	
	public double numberSaves=0,action,firstNumber , secondNum,result,memory1=0,memory2=0,memory3=0,memory4=0;
	
	/*Departments*/
	Scanner scan=new Scanner(System.in);
	
	/*functions to get the result that the user save
	 *  in memory1/memory2/memory3/memory4*/
	
	public double getMemory1(){
		
		return 	memory1;
		}
	
	public double getMemory2(){
		
		return 	memory2;
		}
	
	public double getMemory3(){
		
		return 	memory3;
		}
	
	public double getMemory4(){
		
		return 	memory4;
		}
		
	//////////////////////////////////////////////////////////////////
	//																//
	//  function for the syso print of the action result calculator	//
	//																//
	//////////////////////////////////////////////////////////////////
	
	public void calculatorPrintAction(){
		System.out.println("\n------------------------------");
		System.out.println("PLEASE CHOOSE ACTION:");
		System.out.println("Press 1 - [+] Addition");
		System.out.println("Press 2 - [-] Subtraction");
		System.out.println("Press 3 - [*] Multiplication");
		System.out.println("Press 4 - [^] Power");
		System.out.println("Press 5 - find if prime");
		

	}
	//////////////////////////////////////////////////////////////////
	//																//
	//  function for the syso print of the save result calculator	//
	//																//
	//////////////////////////////////////////////////////////////////
	
	public void calculatorPrintSave(){
		System.out.println();
		System.out.println("Do you want to save the result in memory?");
		System.out.println("Press 0 - Don't Save");
		System.out.println("Press 1 - Save in memory 1");
		System.out.println("Press 2 - Save in memory 2");
		System.out.println("Press 3 - Save in memory 3");
		System.out.println("Press 4 - Save in memory 4");
	}
	
	 //////////////////////////////////////////////////////////////////////////////////////////////
	 //																							 //
	 //*  function that gets the result that user save and return if the user save result		 //
	 //*  when the user saved two results, the main gets the result and open					 //
	 //*  new option to create planet															 //
	 //*  																						 //
	 //*///////////////////////////////////////////////////////////////////////////////////////////
	
	public double calculatorSave(double mathResult){
		result=mathResult;
		calculatorPrintSave();
		action=scan.nextInt();
		
		if(action==OPTION_QUIT){
			System.out.println("Your Result Don't save.");
		}
		
		if(action==OPTION_ONE){
			memory1=result;
			numberSaves++;
			System.out.println("Your Result saved in Memory 1.");
		}
			
		if(action==OPTION_TWO){
			memory2=result;
			numberSaves++;
			System.out.println("Your Result saved in Memory 2.");
		}
			
		if(action==OPTION_TREE){
			memory3=result;
			numberSaves++;
			System.out.println("Your Result saved in Memory 3.");
		}
			
		if(action==OPTION_FOUR){
			memory4=result;
			numberSaves++;
			System.out.println("Your Result saved in Memory 4.");
		}
		return numberSaves;
	}
	
	
	//////////////////////////////////////////////////////////////////////////////
	/*           function to the math Addition numbers							//
	/* 																			//
	/*  the function will print to the user and get two numbers to Addition		//
	/*  then the result will be enter to calculatorSave function in side the	//
	/*  addition function and check												//
	/*  if the user what to save the result										//
	/*  and the function return if the user save the result						//
	//////////////////////////////////////////////////////////////////////////////
	 * 
	 */
	
	public double Addition(){
		
		System.out.println("You have chosen ADDITION!");
		System.out.println("Enter a number:");
		firstNumber=scan.nextInt();
		System.out.println("+");
		secondNum=scan.nextInt();
		
		result=firstNumber+secondNum;
		System.out.println("= "+result);
		
		result=calculatorSave(result);
		return result;
		
	}
	
	
//////////////////////////////////////////////////////////////////////////////
/*           function to the math subtraction numbers						//
/* 																			//
/*  the function will print to the user and get two numbers to subtraction	//
/*  then the result will be enter to calculatorSave function in side the	//
/*  subtraction function and check											//
/*  if the user what to save the result										//
/*  and the function return if the user save the result						//
//////////////////////////////////////////////////////////////////////////////
* 
*/
	
	
	public double subtraction(){
		
		System.out.println("You have chosen SUBTRACTION!");
		System.out.println("Enter a number:");
		firstNumber=scan.nextInt();
		System.out.println("-");
		secondNum=scan.nextInt();
		
		result=firstNumber-secondNum;
		System.out.println("= "+result);
		
		result=calculatorSave(result);
		return result;
	}
	
	
//////////////////////////////////////////////////////////////////////////////
/*           function to the math Multiplication numbers					//
/* 																			//
/*  the function will print to the user and get two numbers to 				//
/*  Multiplication															//
/*	then the result will be enter to calculatorSave function in side the	//																		//
/*	Multiplication function and check										//							
/*  if the user what to save the result										//
/*  and the function return if the user save the result						//							
*/////////////////////////////////////////////////////////////////////////////
	
	
	
	public double Multiplication(){
		
		System.out.println("You have chosen MULTIPLICATION!");
		System.out.println("Enter a number:");
		firstNumber=scan.nextInt();
		System.out.println("*");
		secondNum=scan.nextInt();

		result=firstNumber*secondNum;
		System.out.println("= "+result);
		
		result=calculatorSave(result);
		return result;
	}
	
//////////////////////////////////////////////////////////////////////////////
/*           function to the math power numbers								//
/* 																			//
/*  the function will print to the user and get two numbers to 				//
/*  power first is the base second is the power								//
/*	then the result will be enter to calculatorSave function in side the	//																		//
/*	power function and check												//							
/*  if the user what to save the result										//
/*  and the function return if the user save the result						//							
*/////////////////////////////////////////////////////////////////////////////
	
	public double power(){
		
		double sum=1;
		
		System.out.println("You have chosen POWER!");
		System.out.println("Enter a number:");
		firstNumber=scan.nextInt();
		System.out.println("^");
		secondNum=scan.nextInt();
		
		for(int i=1;i<=secondNum;i++)
			sum*=firstNumber;
		
		System.out.println("= "+sum);
		
		result=calculatorSave(sum);
		return sum;
	}
	
	
//////////////////////////////////////////////////////////////////////////////
/*           function to the math prime numbers								//
/* 																			//
/*  the function will print to the user and get one number to find			//
/*  prime 																	//
/*	then the result will be enter to calculatorSave function in side the	//																		//
/*	prime function and check												//							
/*  if the user what to save the result										//
/*  and the function return if the user save the result						//							
*/////////////////////////////////////////////////////////////////////////////
	
	public double prime(){
		int flag=1;
		
		System.out.println("FIND IF PRIME?");
		System.out.println("Enter a number:");
		firstNumber=scan.nextInt();
		
		for(double i=firstNumber-1;i>1;i--){
			if(firstNumber%i==0){
				flag=0;
				break;
			}
			
		}
		if(flag==1)
			System.out.println(firstNumber+" is Prime number!");
		else
			System.out.println(firstNumber+" is Not Prime number!");
		
		result=calculatorSave(firstNumber);
		
		return result;
	}
	
	
	
	
}