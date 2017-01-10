
public class calculator {
	
	public double firstNumber , secondNum,sum;
	
	
	public calculator (double firstNumber , double secondNum ){
		this.firstNumber=firstNumber;
		this.secondNum=secondNum;
	}
	
	public void calculatorPrint(){
		System.out.println("\n------------------------------");
		System.out.println("PLEASE CHOOSE ACTION:");
		System.out.println("Press 1 - [+] Addition");
		System.out.println("Press 2 - [-] Subtraction");
		System.out.println("Press 3 - [*] Multiplication");
		System.out.println("Press 4 - [^] Power");
		System.out.println("Press 5 - find if prime");
		
	}
	
	public void calculatorSave(){
		System.out.println();
		System.out.println("Do you want to save the result in memory?");
		System.out.println("Press 0 - Don't Save");
		System.out.println("Press 1 - Save in memory 1");
		System.out.println("Press 2 - Save in memory 2");
		System.out.println("Press 3 - Save in memory 3");
		System.out.println("Press 4 - Save in memory 4");
	}
	
	public double getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNum(double firstNumber) {
		this.firstNumber = firstNumber;
	}

	public double getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(double secondNum) {
		this.secondNum = secondNum;
	}
	
	public double Addition(double firstNumber , double secondNum){
		sum=firstNumber+secondNum;
		return sum;
	}
	
	public double subtraction(double firstNumber , double secondNum){
		sum=firstNumber-secondNum;
		return sum;
	}
	
	public double Multiplication(double firstNumber , double secondNum){
		sum=firstNumber*secondNum;
		return sum;
	}
	public long power(double firstNumber , double secondNum){
		long rezult=1;
		for(int i=1;i<=secondNum;i++)
			rezult*=firstNumber;
		return rezult;
	}
	
	public void prime(double firstNumber){
		int flag=1;
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
	}
	
}