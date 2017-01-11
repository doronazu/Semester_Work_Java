import java.util.Scanner;

public class start {
	
	public static final int OPTION_QUIT = 0;
	public static final int OPTION_ONE = 1;
	public static final int OPTION_TWO = 2;
	public static final int OPTION_TREE = 3;
	public static final int OPTION_FOUR = 4;
	public static final int OPTION_FIVE = 5;
	public static final int OPTION_SIX = 6;
	public static final int OPTION_SEVEN = 7;

	public double rezult=0;
	
	public static void main(String[] args) {
		
		int i=1;
		double planetSaves=0,numberSaves=0,firstNumber , secondNum,action=1,rezult=0;
		double memory1=0,memory2=0,memory3=0,memory4=0,planetMemory1,planetMemory2,planetMemory3,planetMemory4;
		
		Scanner scan=new Scanner(System.in);
		calculator c = new calculator();
		planet p = new planet();
		
	while(action > 0){
		
		c.calculatorPrintAction();
		if(numberSaves>=2)
			System.out.println("Press 6 - CREATE A NEW PLANET");
		if(planetSaves > 0)
			System.out.println("Press 7 - SEE Your Galaxsy");
		System.out.println("Press 0 - TO EXIT");
		
		action=scan.nextInt();
		
		if(action==OPTION_ONE)
			numberSaves=c.Addition();
		
		if(action==OPTION_TWO)
			numberSaves=c.subtraction();
		
		if(action==OPTION_TREE)
			numberSaves=c.Multiplication();
			
		if(action==OPTION_FOUR)
			numberSaves=c.power();
		
		if(action==OPTION_FIVE)
			numberSaves=c.prime();
		
		if(action==OPTION_SIX){
			planetMemory1=c.getMemory1();
			planetMemory2=c.getMemory2();
			planetMemory3=c.getMemory3();
			planetMemory4=c.getMemory4();
			planetSaves=p.cratePlanet(planetMemory1, planetMemory2, planetMemory3, planetMemory4);
		}
		
		if(action==OPTION_SEVEN)
			p.theGalaxsy();
			
		
	}

	}
	
}
