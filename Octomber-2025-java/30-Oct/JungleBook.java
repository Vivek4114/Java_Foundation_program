class Animal{

	Animal getAnimalDetails(){
	
		System.out.println("Animal from Animal Class");
		return new Animal();
	}
		
}
class Lion extends Animal{

	@Override
	Lion getAnimalDetails(){
	
		System.out.println("Lion from Lion Class");
		return new Lion();
	}
	
	public void getAnimalName(){
		System.out.println("Animal name is Lion");
	}
	
}

public class JungleBook{
	public static void main(String []args){
	
		Lion a = new Lion();
		a.getAnimalDetails().getAnimalName();
		 
		}
}
		