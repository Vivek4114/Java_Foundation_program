class A{
	public void m1(String str){
	System.out.println("Hi from Str");
	}
}

class B extends A{
	
	public void m1(Integer obj){
	System.out.println("Hi from obj");
	}
	
	public static void main(String []args){
	B b = new B();
	b.m1(null);
	
	}
	
}