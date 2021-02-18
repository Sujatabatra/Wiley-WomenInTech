
public class OOPDemoClass {

	public static void main(String args[]){
		Factorial fOb=new Factorial();
		fOb.input(5);
//		fOb.number=fOb.number*0;
		fOb.calculateFactorial();
		fOb.displayFactorial();
		
		ModifiedFactorial fOb1=new ModifiedFactorial();
		fOb1.setNumber(4);
		System.out.println("Factorial from Modified Factorial class : "+fOb1.getFactorial());
	}
}
