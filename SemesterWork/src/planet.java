import java.util.Scanner;

public class planet {
	
	public static final int OPTION_QUIT = 0;
	public static final int OPTION_ONE = 1;
	public static final int OPTION_TWO = 2;
	public static final int OPTION_TREE = 3;
	public static final int OPTION_FOR = 4;
	public static final int OPTION_FIVE = 5;
	public static final int OPTION_SIX = 6;
	
	public double action, planetWeight , planetDistance,planetMemory1=0,planetMemory2=0,planetMemory3=0,planetMemory4=0;
	Scanner scan=new Scanner(System.in);
	public void planetSave(){
		
	}
	
	public void getmemory(double x){
		
		planetMemory1=x;
	}
	
	public void cratePlanet(double planetMemory1,double planetMemory2,double planetMemory3,double planetMemory4){
		this.planetMemory1=planetMemory1;
		this.planetMemory2=planetMemory2;
		this.planetMemory3=planetMemory3;
		this.planetMemory4=planetMemory4;
		
		System.out.println("CREATE YOURE PLANET:");
		System.out.println("Select a number from memory, It would be the weight of your planet in Megaton");
		if(planetMemory1 != 0 )
			System.out.println("Press 1 to use Memory 1 - "+planetMemory1);
		if(planetMemory2 != 0 )
			System.out.println("Press 2 to use Memory 2 - "+planetMemory2);
		if(planetMemory3 != 0 )
			System.out.println("Press 3 to use Memory 3 - "+planetMemory3);
		if(planetMemory4 != 0 )
			System.out.println("Press 4 to use Memory 4 - "+planetMemory4);
		action=scan.nextInt();
		
		if(action==OPTION_ONE)
			planetWeight=planetMemory1;
		if(action==OPTION_TWO)
			planetWeight=planetMemory2;
		if(action==OPTION_TREE)
			planetWeight=planetMemory3;
		if(action==OPTION_FOR)
			planetWeight=planetMemory4;
		
		System.out.println("Select one more number from memory, It would be the distance of your planet from the sun in Kilometers");
		if(planetMemory1 != 0 )
			System.out.println("Press 1 [Memory 1] - "+planetMemory1);
		if(planetMemory2 != 0 )
			System.out.println("Press 2 [Memory 2] - "+planetMemory2);
		if(planetMemory3 != 0 )
			System.out.println("Press 3 [Memory 3] - "+planetMemory3);
		if(planetMemory4 != 0 )
			System.out.println("Press 4 [Memory 4] - "+planetMemory4);
		action=scan.nextInt();
		
		if(action==OPTION_ONE)
			planetDistance=planetMemory1;
		if(action==OPTION_TWO)
			planetDistance=planetMemory2;
		if(action==OPTION_TREE)
			planetDistance=planetMemory3;
		if(action==OPTION_FOR)
			planetDistance=planetMemory4;
		
		System.out.println("your planet weight "+planetWeight+": Megaton");
		System.out.println("your planet distance from the sun "+planetDistance+" Kilometers");
	}
	
	public void cratePlanet(double planetWeight , double planetDistance){
			
		System.out.println("your planet weight "+planetWeight+": Megaton");
		System.out.println("your planet distance from the sun "+planetDistance+" Kilometers");
	}

	
	
	
//	System.out.println("CREATE YOURE PLANET:");
//	System.out.println("Select a number from memory, It would be the weight of your planet in Megaton");
//	if(memory1 != 0 )
//		System.out.println("Press 1 to use Memory 1 - "+memory1);
//	if(memory2 != 0 )
//		System.out.println("Press 2 to use Memory 2 - "+memory2);
//	if(memory3 != 0 )
//		System.out.println("Press 3 to use Memory 3 - "+memory3);
//	if(memory4 != 0 )
//		System.out.println("Press 4 to use Memory 4 - "+memory4);
//	firstNumber=scan.nextInt();
//	
//	if(firstNumber==OPTION_ONE)
//		firstNumber=memory1;
//	if(firstNumber==OPTION_TWO)
//		firstNumber=memory2;
//	if(firstNumber==OPTION_TREE)
//		firstNumber=memory3;
//	if(firstNumber==OPTION_FOR)
//		firstNumber=memory4;
//	
//	System.out.println("Select one more number from memory, It would be the distance of your planet from the sun in Kilometers");
//	if(memory1 != 0 )
//		System.out.println("Press 1 [Memory 1] - "+memory1);
//	if(memory2 != 0 )
//		System.out.println("Press 2 [Memory 2] - "+memory2);
//	if(memory3 != 0 )
//		System.out.println("Press 3 [Memory 3] - "+memory3);
//	if(memory4 != 0 )
//		System.out.println("Press 4 [Memory 4] - "+memory4);
//	secondNum=scan.nextInt();
//	
//	if(secondNum==OPTION_ONE)
//		secondNum=memory1;
//	if(secondNum==OPTION_TWO)
//		secondNum=memory2;
//	if(secondNum==OPTION_TREE)
//		secondNum=memory3;
//	if(secondNum==OPTION_FOR)
//		secondNum=memory4;
//	
//	p.cratePlanet(firstNumber, secondNum);
    

}
