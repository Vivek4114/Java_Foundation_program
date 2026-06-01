class Parent{

void show(Object obj){
System.out.println("Parent  : Obj");
}

void show(String str){
System.out.println("Parent : String");
}
}

class child extends Parent{
	void show(Integer itr){
	System.out.println("Child: itr");
	}
	@Override
	void show(String str){
		System.out.println("Child: str");
		}
		
	}
	
public class main{
		public static void main(String []args){
		Parent p = new child();
		
		p.show("hellow");
		p.show(33);
	}
}