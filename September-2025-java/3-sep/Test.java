import java.io.*;

class Test{
public static void main(String [] args){

	int n;
	
	try{
	DataInputStream obj = new DataInputStream(System.in);
	
	
	n = Integer.parseInt(obj.readLine());
	
	System.out.println("n value is : " + n);
	
	} catch(IOException er){ } 
	}
}

