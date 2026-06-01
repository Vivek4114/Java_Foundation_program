 import java.io.*;
 
class PrintNumber {
    public static void main(String[] args) {
    int i ;
    
    try{
        DataInputStream obj = new DataInputStream(System.in);
        
        for(i = 0; i<=5; i++){
            System.out.println(" "+i);
        }
        
    }
    catch(IOException er){}
    }
}