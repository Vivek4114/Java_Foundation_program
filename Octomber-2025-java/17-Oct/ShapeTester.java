class Circle 
{
	 double radius ;
	 
	 Circle(){
		 this.radius = 0;
	 }
	 
	 Circle(double radius){
		 
			this.radius = radius;
		   
	 }
	 
	 public double getAra(){
		 
		if(radius  > 0){
			double area = 3.14 * radius * radius;
			return area;
		}else{
			return -1 ;
		}
	 }
		 
}

class Cylinder extends Circle
{
	double height;
	
	Cylinder(){
		super();
		height = 0;
	}
	
	Cylinder(double radius , double height ){
		super(radius);
		this.height = height;
	}
	
	public double getVolume(){
		if(height > 0 && radius > 0){
			return  3.14 * radius * radius  * height;
		}
		else{
			System.err.println("Invalid Input");
			return -1;
		}
		
		
	}
		
	
	public double getArea(){
		if(height > 0 && radius > 0){
			return (2 * 3.14 * radius   * height) + 2 * 3.14 * radius * radius ;
		}
		else{
			System.err.println("Invalid Input");
			return -1;
		}
 
	}
}

public class ShapeTester
{
	public static void main(String [] args){
		Cylinder cylinder1 = new Cylinder(5 , 5 );	
		System.out.println("Volume : "+cylinder1.getVolume());
		System.out.println("Area : " + cylinder1.getArea());
		
	}
}
