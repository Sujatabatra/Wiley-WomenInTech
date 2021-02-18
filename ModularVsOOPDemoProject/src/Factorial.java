
public class Factorial {

	private int number,factorial;
	
	public void input(int no){
		number=no;
	}
	
	public void calculateFactorial(){
		factorial=1;
		while(number>=1)
			factorial*=number--;
	}
	
	public void displayFactorial(){
		System.out.println("Factorial : "+factorial);
	}
}
