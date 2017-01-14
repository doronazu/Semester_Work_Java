import java.util.Scanner;

public class planet {
	
	//////////////////////////////////////////////////
	//												//
	//	  This class create objects,				//
	//	  the class contains functions				//	
	//	  Some did not return a value, and some do	//
	//												//
	//////////////////////////////////////////////////
	
	//////////////////////////////////////////////////////	
	//													//
	//		Defines SIX magic numbers for the options	//								
	//													//
	//////////////////////////////////////////////////////
	
	public static final int OPTION_QUIT = 0;
	public static final int OPTION_ONE = 1;
	public static final int OPTION_TWO = 2;
	public static final int OPTION_TREE = 3;
	public static final int OPTION_FOUR = 4;
	public static final int OPTION_FIVE = 5;
	public static final int OPTION_SIX = 6;
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																											//
//							Variabels list																	//
//																											//
//	action = action = the option the user chose to do in the class planet									//
//	planetWeight = the weight of the planet																	//
//	planetDistance = the distance of the planet from the sun												//
//	planetMemory1 = this var gets the result from calculator trow the main to here							//
//	planetMemory2 = this var gets the result from calculator trow the main to here							//
//	planetMemory3 = this var gets the result from calculator trow the main to here							//
//	planetMemory4 = this var gets the result from calculator trow the main to here							//
//	planetSpace1w = this var get value from "var planetMemory" and he save the planet weight				//
//	planetSpace1d = this var get value from "var planetMemory" and he save the planet distance				//
//	planetSpace2w = this var get value from "var planetMemory" and he save the planet weight				//
//	planetSpace2d = this var get value from "var planetMemory" and he save the planet distance				//
//	planetSpace3w = this var get value from "var planetMemory" and he save the planet weight				//
//	planetSpace3d = this var get value from "var planetMemory" and he save the planet distance				//
//	planetSpace4w = this var get value from "var planetMemory" and he save the planet weight				//
//	planetSpace4d = this var get value from "var planetMemory" and he save the planet distance				//
//	planetName1 = this var get from the user the name of is planet											//
//	planetName2 = this var get from the user the name of is planet											//
//	planetName3 = this var get from the user the name of is planet											//
//	planetName4 = this var get from the user the name of is planet											//
//																											//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public double action, planetWeight , planetDistance,planetMemory1=0,planetMemory2=0,planetMemory3=0,planetMemory4=0;
	public double planetSpace1w=0,planetSpace1d=0,planetSpace2w=0,planetSpace2d=0,planetSpace3w=0,planetSpace3d=0,planetSpace4w=0,planetSpace4d=0,planetSaves=0;
	public double spacefull1=0,spacefull2=0,spacefull3=0,spacefull4=0,destroy;
	String planetName1,planetName2,planetName3,planetName4,Yes="y",No="n";
	
	
	Scanner scan=new Scanner(System.in);

//////////////////////////////////////////////////////////////////////////////////////////////////////	
//																									//
//	function crarePlanet																			//
//	this function get the saved results from the calculator save function							//
//	the save result move from the calculator class to the main clas and go to planet class			//
//	to here																							//
//																									//
//////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public double cratePlanet(double planetMemory1,double planetMemory2,double planetMemory3,double planetMemory4){
		this.planetMemory1=planetMemory1;
		this.planetMemory2=planetMemory2;
		this.planetMemory3=planetMemory3;
		this.planetMemory4=planetMemory4;
		
		System.out.println("CREATE YOURE PLANET:");
		System.out.println("Select a number from memory, It would be the weight of your planet in Megaton");
		if(planetMemory1 != OPTION_QUIT )
			System.out.println("Press 1 [Memory 1] - "+planetMemory1+"Mt");
		if(planetMemory2 != OPTION_QUIT )
			System.out.println("Press 2 [Memory 2] - "+planetMemory2+"Mt");
		if(planetMemory3 != OPTION_QUIT )
			System.out.println("Press 3 [Memory 3] - "+planetMemory3+"Mt");
		if(planetMemory4 != OPTION_QUIT )
			System.out.println("Press 4 [Memory 4] - "+planetMemory4+"Mt");
		action=scan.nextInt();
		
		if(action==OPTION_ONE)
			planetWeight=planetMemory1;
		if(action==OPTION_TWO)
			planetWeight=planetMemory2;
		if(action==OPTION_TREE)
			planetWeight=planetMemory3;
		if(action==OPTION_FOUR)
			planetWeight=planetMemory4;
		
		System.out.println("Select one more number from memory, It would be the distance of your planet from the sun in Kilometers");
		if(planetMemory1 != OPTION_QUIT )
			System.out.println("Press 1 [Memory 1] - "+planetMemory1+"Km");
		if(planetMemory2 != OPTION_QUIT )
			System.out.println("Press 2 [Memory 2] - "+planetMemory2+"Km");
		if(planetMemory3 != OPTION_QUIT )
			System.out.println("Press 3 [Memory 3] - "+planetMemory3+"Km");
		if(planetMemory4 != OPTION_QUIT )
			System.out.println("Press 4 [Memory 4] - "+planetMemory4+"Km");
		action=scan.nextInt();
		
		if(action==OPTION_ONE)
			planetDistance=planetMemory1;
		if(action==OPTION_TWO)
			planetDistance=planetMemory2;
		if(action==OPTION_TREE)
			planetDistance=planetMemory3;
		if(action==OPTION_FOUR)
			planetDistance=planetMemory4;
		
		System.out.println("your planet weight is "+planetWeight+" Megaton");
		System.out.println("your planet distance from the sun is "+planetDistance+" Kilometers");
		
		planetSaves=planetSave();
		return planetSaves;
		
	}
	
//////////////////////////////////////////////////////////////////////////
//																		//
//	planet save function												//
//	this function saves the planets the user crate and get the name		//
//	into a string var													//
//	if the user alredy saved planet in some var the function will ask	//
//	if the user shore to destroy the planet last saved 					//
//	and save the new one.												//
//																		//
//////////////////////////////////////////////////////////////////////////
	
    public double planetSave(){
    	
    	
    	
    	
    	System.out.println("\n****************************************************");
		System.out.println("Do you Want to Save your Planet in !-The Galaxsy-!?\n");
		System.out.println("Press 0 - Don't Save");
		
		if(spacefull1==OPTION_ONE)
			System.out.println("Press 1 - space 1 is full ["+planetName1+" Planet] but save it anyway!");
		else
			System.out.println("Press 1 - Save [Space 1] Empty.");
		
		if(spacefull2==OPTION_ONE)
			System.out.println("Press 2 - space 2 is full ["+planetName2+" Planet] but save it anyway!");
		else
			System.out.println("Press 2 - Save [Space 2] Empty.");
		
		if(spacefull3==OPTION_ONE)
			System.out.println("Press 3 - space 3 is full ["+planetName3+" Planet] but save it anyway!");
		else
			System.out.println("Press 3 - Save [Space 3] Empty.");
		
		if(spacefull4==OPTION_ONE)
			System.out.println("Press 4 - space 4 is full ["+planetName4+" Planet] but save it anyway!");
		else
			System.out.println("Press 4 - Save [Space 4] Empty.");
		
		
		action=scan.nextInt();

		
    	if(action==OPTION_QUIT)
			System.out.println("Your Rezult Don't save.");
		
		
		if(action==OPTION_ONE){
			
			if(spacefull1==OPTION_ONE){
				System.out.println("Do you want to  to DESTROY "+planetName1+"?\n");
				System.out.println("       Press 1 - YES\n");
				System.out.println("       Press 2 - NO");
				destroy=scan.nextInt();
				if(destroy==OPTION_TWO)
					planetSave();
				
				else{
					System.out.println("What is the name of your New Star? \n      Use [A-Z] [a-z]");
					planetName1=scan.next();
					planetSpace1w=planetWeight;
					planetSpace1d=planetDistance;
					System.out.println("Your Planet "+planetName1+" Save is Galexsy Space 1");
					spacefull1=OPTION_ONE;
					planetSaves++;
				}
			    }
			else{
				System.out.println("What is the name of your New Star? \n      Use [A-Z] [a-z]");
				planetName1=scan.next();
				planetSpace1w=planetWeight;
				planetSpace1d=planetDistance;
				System.out.println("Your Planet "+planetName1+" Save is Galexsy Space 1");
				spacefull1=OPTION_ONE;
				planetSaves++;
			}
			
			
		}
		
		if(action==OPTION_TWO){
			
			if(spacefull2==OPTION_ONE){
				System.out.println("Do you want to  to DESTROY "+planetName2+"?\n");
				System.out.println("       Press 1 - YES\n");
				System.out.println("       Press 2 - NO");
				destroy=scan.nextInt();
				if(destroy==OPTION_TWO)
					planetSave();
				
				else{
					System.out.println("What is the name of your New Star? \n      Use [A-Z] [a-z]");
					planetName2=scan.next();
					planetSpace2w=planetWeight;
					planetSpace2d=planetDistance;
					System.out.println("Your Planet "+planetName2+" Save is Galexsy Space 2");
					spacefull2=OPTION_ONE;
					planetSaves++;

				}
			    }
			else{
				System.out.println("What is the name of your New Star? \n      Use [A-Z] [a-z]");
				planetName2=scan.next();
				planetSpace2w=planetWeight;
				planetSpace2d=planetDistance;
				System.out.println("Your Planet "+planetName2+" Save is Galexsy Space 2");
				spacefull2=OPTION_ONE;
				planetSaves++;
			}

		}
		
		if(action==OPTION_TREE){
			
			if(spacefull3==OPTION_ONE){
				System.out.println("Do you want to  to DESTROY "+planetName3+"?\n");
				System.out.println("       Press 1 - YES\n");
				System.out.println("       Press 2 - NO");
				destroy=scan.nextInt();
				if(destroy==OPTION_TWO)
					planetSave();
				
				else{
					System.out.println("What is the name of your New Star? \n      Use [A-Z] [a-z]");
					planetName3=scan.next();
					planetSpace3w=planetWeight;
					planetSpace3d=planetDistance;
					System.out.println("Your Planet "+planetName3+" Save is Galexsy Space 3");
					spacefull3=OPTION_ONE;
					planetSaves++;

				}
			}
			else {
				System.out.println("What is the name of your New Star? \n      Use [A-Z] [a-z]");
				planetName3=scan.next();
				planetSpace3w=planetWeight;
				planetSpace3d=planetDistance;
				System.out.println("Your Planet "+planetName3+" Save is Galexsy Space 3");
				spacefull3=OPTION_ONE;
				planetSaves++;

			}
		}
		
		if(action==OPTION_FOUR){
			
			if(spacefull4==OPTION_ONE){
				System.out.println("Do you want to  to DESTROY "+planetName4+"?\n");
				System.out.println("       Press 1 - YES\n");
				System.out.println("       Press 2 - NO");
				destroy=scan.nextInt();
				if(destroy==OPTION_TWO)
					planetSave();
				
				else{
					System.out.println("What is the name of your New Star? \n      Use [A-Z] [a-z]");
					planetName4=scan.next();
					planetSpace4w=planetWeight;
					planetSpace4d=planetDistance;
					System.out.println("Your Planet "+planetName4+" Save is Galexsy Space 4");
					spacefull4=OPTION_ONE;
					planetSaves++;
				}
			}
			else{
				System.out.println("What is the name of your New Star? \n      Use [A-Z] [a-z]");
				planetName4=scan.next();
				planetSpace4w=planetWeight;
				planetSpace4d=planetDistance;
				System.out.println("Your Planet "+planetName4+" Save is Galexsy Space 4");
				spacefull4=OPTION_ONE;
				planetSaves++;
			}
			

		}
			
		return planetSaves++;
    }
    
//////////////////////////////////////////////////////////////////////
//    																//
//    function the galaxsy											//
//    this function only print to the user the planet he saved		//
//																	//
//////////////////////////////////////////////////////////////////////    
    public double theGalaxsy(){
    	
    	System.out.println("\n\n\t WELCOME TO YOUR GALAXSY:\n");
    	
    	if(planetSpace1w!=0){
    		System.out.println("    Space 1 :\n\t"+planetName1+" Planet");
    		System.out.println("\t  Weight - "+planetSpace1w+" Megaton"+"\n\t  "+planetSpace1d+"km from the Sun");
    	}
    	if(planetSpace2w!=0){
    		System.out.println("    Space 2 :\n\t"+planetName2+" Planet");
		    System.out.println("\t  Weight - "+planetSpace2w+" Megaton"+"\n\t  "+planetSpace2d+"km from the Sun");
    	}
    	if(planetSpace3w!=0){
    		System.out.println("    Space 3 :\n\t"+planetName3+" Planet");
	    	System.out.println("\t  Weight - "+planetSpace3w+" Megaton"+"\n\t  "+planetSpace3d+"km from the Sun");
    	}
    	if(planetSpace4w!=0){
    		System.out.println("    Space 4 :\n\t"+planetName4+" Planet");
		    System.out.println("\t  Weight - "+planetSpace4w+" Megaton"+"\n\t  "+planetSpace4d+"km from the Sun");
    	}
    	
    	System.out.println("\n _____________________");
    	System.out.println("| CONTINUE  - Press 1 |");
    	System.out.println("| EXIT      - Prass 0 |");
    	System.out.println("|_____________________|");
    	action=scan.nextInt();
    	return action;
    }

}
