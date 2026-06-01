/* 
Wap for the following requirement 
- create an abstract method in an interface
- complete the method in immediate sub class
-  draw class Diagram.
*/


interface Product{

	public abstract void categary();
	
}

class TV implements Product{

	@Override
	public void categary(){
		System.out.println("Tv has the Categary Electronics");
		
	}

}

public class Shops{

	public static void main(String []args){
	
		TV tv = new TV();
		tv.categary();
	
	}
}
	