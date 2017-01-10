

public class planet {
	
	public double planetWeight , planetDistance;
	
	
	
	public planet (double planetWeight , double planetDistance ){
		this.planetWeight=planetWeight;
		this.planetDistance=planetDistance;
	}
	public double getplanetWeight() {
		return planetWeight;
	}

	public void setplanetWeight(double firstNumber, double planetWeight) {
		this.planetWeight = planetWeight;
	}

	public double getplanetDistance() {
		return planetDistance;
	}

	public void setplanetDistance(double planetDistance) {
		this.planetDistance = planetDistance;
	}
	
//	public void planetSave(){
//		
//		double var1=0,var2=0,var3=0,var4=0,firstNumber,secondNum;
//		
//		System.out.println("Create a New Planet:");
//		System.out.println("What should be used as planet weight?");
//		if(var1 != 0 )
//			System.out.println("1 - "+var1);
//		if(var2 != 0 )
//			System.out.println("2 - "+var2);
//		if(var3 != 0 )
//			System.out.println("3 - "+var3);
//		if(var4 != 0 )
//			System.out.println("4 - "+var4);
//		Scanner scan=new Scanner(System.in);
//		firstNumber=scan.nextInt();
//		
//		if(firstNumber==1)
//			firstNumber=var1;
//		if(firstNumber==2)
//			firstNumber=var2;
//		if(firstNumber==3)
//			firstNumber=var3;
//		if(firstNumber==3)
//			firstNumber=var3;
//		
//		System.out.println("What should be used as planet distance from sun?");
//		if(var1 != 0 )
//			System.out.println("1 - "+var1);
//		if(var2 != 0 )
//			System.out.println("2 - "+var2);
//		if(var3 != 0 )
//			System.out.println("3 - "+var3);
//		if(var4 != 0 )
//			System.out.println("4 - "+var4);
//		secondNum=scan.nextInt();
//		
//		if(secondNum==1)
//			secondNum=var1;  				need to fix
//		if(secondNum==2)
//			secondNum=var2;
//		if(secondNum==3)
//			secondNum=var3;
//		if(secondNum==4)
//			secondNum=var4;
//		
//		System.out.println(planetWeight+": Megaton");
//		System.out.println(planetDistance+": Kilometers");
//		
//	}
	
	public void cratePlanet(double planetWeight , double planetDistance){
			
		System.out.println("your planet weight "+planetWeight+": Megaton");
		System.out.println("your planet distance from the sun "+planetDistance+" Kilometers");
	}


}
