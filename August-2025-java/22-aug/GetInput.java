import java.io.*;
 

public class GetInput {
    public static void main(String[] args){
		
		try {
        DataInputStream obj = new DataInputStream(System.in);

        System.out.print("Enter your name: ");
        String name = obj.readLine();  // Deprecated!

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(obj.readLine());  // Needs conversion from String

        System.out.println("Hello, " + name + ". You are " + age + " years old.");
    }
	catch(IOException er ) 
	{}
	
	}
}
