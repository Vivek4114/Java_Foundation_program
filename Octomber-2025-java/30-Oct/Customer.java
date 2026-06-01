interface Bikaner{

	void sweets();
	void tests();
}

class Rasmalai implements Bikaner{

	@Override
	public void sweets(){
		System.out.println("Rasmalai  is delicious");
	}
	
	@Override
	public void tests(){
	
		System.out.println(" Rasmali product test are yammy ");
		
	}
	
}


public class Customer{
	public static void main(String []args){
	
		Rasmalai rasmalai = new Rasmalai();
		rasmalai.sweets();
		rasmalai.tests();
	}
}
	
		
	