import java.util.Scanner;

class CarSpeedTracker{
    String CarName ;
    int Speed;
    int count = 0 ;
	int accValue;

    public static void main(String args[]){
        CarSpeedTracker c1 = new CarSpeedTracker();
        CarSpeedTracker c2 = new CarSpeedTracker();

        c1.setInput();
        c2.setInput();

    }

    public void setInput(){
        count++;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Car : "+count +" Name :" );
        String CarName = sc.nextLine();
        this.CarName = CarName;

        System.out.println("Enter accelerate Value of "+ this.CarName + " : ");
        int accValue = sc.nextInt();
		this.accValue = accValue;
		
        System.out.println("Enter the Break value for : "+ this.CarName + " : ");
        int bre = sc.nextInt();
		
		
        accelerate(accValue);
        brake(bre);


    }

    public void accelerate(int increment){

        System.out.println(this.CarName + " accelerate by "+ increment +" Km/h");
         System.out.println(this.CarName + " Current Speed  "+ increment +" Km/h");

    }

    public void brake(int decrement){

        System.out.println(this.CarName + " Slow Down  "+ decrement +" Km/h");
        System.out.println(this.CarName + " Current Speed "+ (this.accValue - decrement) +" Km/h");


    }

    public void showSpeed(){


    }


}