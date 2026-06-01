import java.util.Scanner;

public class RideSharingApp{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int ETA[] = new int[6];
        for(int i = 0; i<ETA.length; i++){
            ETA[i] = sc.nextInt();
        }

        
        findClosestDriver(ETA);

    }

    public static int findClosestDriver(int[] etas ) {
        int position = 0;
       int min = etas[0];
      
     for(int i = 0 ; i<etas.length; i++){
        if(min > etas[i]){
            position = i;
            min = etas[i];
        }
     }

     System.out.println(position +" (driver at index "+position + " has ETA = "+min +" min)");
     return 0;

    }

}