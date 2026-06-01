class Sample{

	public Sample m1(){
		System.out.println("m1 is Executed");
		return this;
	}
	public Sample m2(){
		System.out.println("m1 is Executed");
		return this;
	}

	
}

class main
{
	public static void main(String [] args){
		System.out.println("Main Executed");
		Sample s = new Sample();
		s.m1().m2();
		
		System.out.println(s.m1());
	}
}
		