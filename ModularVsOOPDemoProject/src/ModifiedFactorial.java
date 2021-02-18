
public class ModifiedFactorial {

	// Data Modifiable : settter
	// Data Reable : getter
	// number - setter : modifiable
	// factorial -getter : readable
	private int number, factorial;

	public void setNumber(int number) {
		this.number = number;
	}

	public int getFactorial() {
		factorial =1;
		
		while(number>=1)
			factorial*=number--;
				
		return factorial;
	}

}
