import java.util.Scanner;

public class start {
	
	public static final int OPTION_QUIT = 0;
	public static final int OPTION_ONE = 1;
	public static final int OPTION_TWO = 2;
	public static final int OPTION_TREE = 3;
	public static final int OPTION_FOR = 4;
	public static final int OPTION_FIVE = 5;
	public static final int OPTION_SIX = 6;
	public double rezult=0;
	
	public static void main(String[] args) {
		
		int i=1;
		double numberSaves=0,firstNumber , secondNum,action,rezult=0,memory1=0,memory2=0,memory3=0,memory4=0;
		
		Scanner scan=new Scanner(System.in);
		calculator c = new calculator();
		planet p = new planet();
		
	while(i>0){
		
		c.calculatorPrintAction();
		if(numberSaves>=2)
			System.out.println("Press 6 - CREATE A NEW PLANET");
		
		action=scan.nextInt();
		
		if(action==OPTION_ONE)
			numberSaves=c.Addition();
		
		if(action==OPTION_TWO)
			numberSaves=c.subtraction();
		
		if(action==OPTION_TREE)
			numberSaves=c.Multiplication();
			
		if(action==OPTION_FOR)
			numberSaves=c.power();
		
		if(action==OPTION_FIVE)
			numberSaves=c.prime();
		
		
		
		if(action==OPTION_SIX){
		
		}
	
		
		
//		action=scan.nextInt();
//		
//		if(action==OPTION_QUIT){
//			System.out.println("Your Rezult Don't save.");
//		}
//		
//		if(action==OPTION_ONE){
//			memory1=rezult;
//			numberSaves++;
//			System.out.println("Your Rezult saved in Memory 1.");
//		}
//			
//		if(action==OPTION_TWO){
//			memory2=rezult;
//			numberSaves++;
//			System.out.println("Your Rezult saved in Memory 2.");
//		}
//			
//		if(action==OPTION_TREE){
//			memory3=rezult;
//			numberSaves++;
//			System.out.println("Your Rezult saved in Memory 3.");
//		}
//			
//		if(action==OPTION_FOR){
//			memory4=rezult;
//			numberSaves++;
//			System.out.println("Your Rezult saved in Memory 4.");
//		}
		
		
		}
	}
	
}
