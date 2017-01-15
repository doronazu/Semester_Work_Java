import java.util.Scanner;

public class start {
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
//																															//
//	This program contains accounts department and the department to create objects											//
//	The user is asked to do arithmetic, the user can save the result only after the two results will be saved, 				//
//	the program will display an option to create a planet by the results saved from previous sessions calculator, 			//
//	the user can save the planet and give it a name, then the program will be able to see planets stored,					//
//	The program ends when the person selects Exit																			//
//																															//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//////////////////////////////////////////////////////////	
	//														//
	//		Defines seven magic numbers for the options		//
	//														//
	//////////////////////////////////////////////////////////
	
	public static final int OPTION_QUIT = 0;
	public static final int OPTION_ONE = 1;
	public static final int OPTION_TWO = 2;
	public static final int OPTION_TREE = 3;
	public static final int OPTION_FOUR = 4;
	public static final int OPTION_FIVE = 5;
	public static final int OPTION_SIX = 6;
	public static final int OPTION_SEVEN = 7;

	
	public static void main(String[] args) {
		
//////////////////////////////////////////////////////////////////////////////////////////
//																						//
//								List of variables										//
//		  																				//
//		 																				//
//	    action = the option the user chose to do in the calculator						//
//	planetSaves = the number of planet the user save									//
//	numberSaves = the number of results from the calculator the user save				//
//	planetMemory1 = gets the results from the calculator if the user save a result		//
//	planetMemory2 = gets the results from the calculator if the user save a result		//
//	planetMemory3 = gets the results from the calculator if the user save a result		//
//	planetMemory4 = gets the results from the calculator if the user save a result		//
//																						//
//////////////////////////////////////////////////////////////////////////////////////////		
		
		
		double planetSaves=0,numberSaves=0,action=1;
		double planetMemory1,planetMemory2,planetMemory3,planetMemory4;
		
	//////////////////////////	
	//						//
	//	 Departments		//
	//						//
	//////////////////////////	
		
		Scanner scan=new Scanner(System.in);
		Calculator c = new Calculator();
		planet p = new planet();
		
	//////////////////////////////////////////////////////////////////////	
	//																	//
	//	   Stop loop software the user chooses to stop working at 0 	//
	//																	//
	//////////////////////////////////////////////////////////////////////
		
	while(action > OPTION_QUIT){
		
	//////////////////////////////////////
	//									//
	//									//
	//	Printing function calculator	//
	//									//
	//////////////////////////////////////
		
		c.calculatorPrintAction();
		if(numberSaves>=2)
			System.out.println("Press 6 - CREATE A NEW PLANET");
		if(planetSaves > 0)
			System.out.println("Press 7 - SEE Your Galaxsy");
		System.out.println("Press 0 - TO EXIT");
		
		action=scan.nextInt();

	//////////////////////////////////////////////////////////////////////////
	//																		//
	//																		//
	//	Chack the option and start to use function calculator 				//
	//																		//
	//	and start function for the calculator math							//
	//																		//
	//////////////////////////////////////////////////////////////////////////
		
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
			action=p.theGalaxsy();
		
		if(action==OPTION_QUIT)
			System.out.println("\n       {:-=bye_bye=-:}");
		
	}

	}
	
	

	}
