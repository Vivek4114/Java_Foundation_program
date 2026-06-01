import java.util.Scanner;

public class IntersectionofTwoArrays{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		int b[] = new int [5];

		for(int i = 0; i<a.length; i++){
			a[i] = sc.nextInt();
		}

		for(int i = 0; i< b.length; i++){
			b[i] = sc.nextInt();
		}

		checkIntersection(a,b);
	}

	public static void checkIntersection(int a[], int b[]){
		/*
	    int c[] =  new int[a.length + b.length];
		int index = 0;

		for(int i = 0; i<a.length; i++){
		 c[index] = a[i];
		 index++;
		}

		for(int i = 0; i< b.length; i++){
			c[index] = b[i];
			 index++;
		}
		
		for(int j=0 ; j < c.length; j++){
				System.out.print(c[j] + " " );
					 
			}*/
		
		

    System.out.print("T: ");
		for(int i = 0; i< a.length; i++){

			for(int j=0; j < b.length; j++){
				
				
					if(a[i] == b[j]){
						System.out.print(a[i]+" ");
					}
				
			}

		}


}
}