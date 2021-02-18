
public class Series {

	private int totalNoOfElements; //Modifiable : setter
	private double result; //Readable  : getter
	
	public void setTotalNoOfElements(int totalNoOfElements) {
		this.totalNoOfElements = totalNoOfElements;
	}
	
	public double getResult() {
		calculateSeries();
		return result;
	}
	
	private void calculateSeries(){
		ModifiedFactorial fOb=new ModifiedFactorial();
		result=0;
		for(int element=1;element<=totalNoOfElements;element++){
			fOb.setNumber(element);
			result=result+fOb.getFactorial()/element;
		}
	}
}
