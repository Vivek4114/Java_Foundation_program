import java.util.Scanner;

public class InsuranceCalculator{
    static Scanner sc = new Scanner(System.in);
    public static void main(String []args){
        String vehicleType = sc.next();
        int vehicleAge = sc.nextInt();
        double vehicleValue = sc.nextDouble();
		

        Vehicle v1 = new Vehicle();
		v1.setVehicleAge(vehicleAge);
		v1.setVehicleType(vehicleType);
		InsurancePremium i1 = new InsurancePremium();
        i1.calculatePremium(v1,vehicleValue);

    }

}

class Vehicle{
    private String vehicleType;
    private int vehicleAge;

    public void setVehicleType(String vehicleType){
        this.vehicleType = vehicleType;
    }

    public void setVehicleAge(int vehicleAge){
        this.vehicleAge = vehicleAge;
    }

    public String getVehicleType(){
        return  vehicleType;
    }

    public int getVehicleAge(){
        return vehicleAge;
    }

    public String displayDetails(){
        return "Vahile Type "+ vehicleType +
                "vehicle Age "+ vehicleAge;
    }
}

class InsurancePremium {
	
     double premiumAmount;

	 
	
    public void calculatePremium(Vehicle vehicle, double vehicleValue){
	 

        if( vehicle.getVehicleType().equals("Car")){

        if( vehicle.getVehicleAge() < 5){
            premiumAmount = 5;
        }
        else if(vehicle.getVehicleAge() >=5 && vehicle.getVehicleAge() <=10){
            premiumAmount = 7;
        }
        else{
            premiumAmount = 10;
        }
    }
    else if(vehicle.getVehicleType().equals("Motorcycle")){
        
        if(vehicle.getVehicleAge()<3){
            premiumAmount = 3;
        }
        else if(vehicle.getVehicleAge() >=3 && vehicle.getVehicleAge() <=8){
            premiumAmount = 5;
        }
        else{
            premiumAmount = 8;
        }
    }
    else if(vehicle.getVehicleType().equals("Truck")){

        if(vehicle.getVehicleAge()<5){
            premiumAmount = 6;
        }
        else if(vehicle.getVehicleAge() >=5 && vehicle.getVehicleAge() <=10){
            premiumAmount = 8;
        }
        else{
            premiumAmount = 12;
        }

    }
	else{
		System.err.println("Invalid vehicle type");
		System.exit(0);
	}

    double insuranceAmount = vehicleValue * premiumAmount/100;
    System.out.println("Insurance Premium: "+insuranceAmount);

    }
    }