
//Just to mimic the behaviour of Modular in JAVA , using static , but you all ignore static for a time being
public class ModularDemoClass {

	static int number,factorial;
	
	static void input(int no){
		number=no;
	}
	
	static void calculateFactorial(){
		factorial=1;
		while(number>=1)
			factorial*=number--;
	}
	
	static void displayFactorial(){
		System.out.println("Factorial : "+factorial);
	}
	public static void main(String[] args) {
		input(5);
		number=number*0; //logical error 
		calculateFactorial();
		displayFactorial();

	}

}
