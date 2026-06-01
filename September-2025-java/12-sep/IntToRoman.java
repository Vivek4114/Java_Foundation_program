import java.util.Scanner;

public class IntToRoman{
	public static void main(String [] args){
		/* 1 → I

4 → IV
5 → V
9 → IX
10 → X
40 → XL
50 → L
90 → XC
100 → C
400 → CD
500 → D
900 → CM
1000 → M
💡 Conversion Logic:*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Integer Number :  " );
		int n = sc.nextInt();
		String roman = " ";
		
		while(n!=0){
			if(n >= 1000 ){
				n = n - 1000;
				roman = roman + "M";				
			}
			else if(n >= 900){
				n = n - 900;
				roman = roman + "CM";
			}
			else if(n >= 500){
				n = n - 500;
				roman = roman + "D";
			}
			else if(n >= 400){
				n = n - 400;
				roman = roman + "CD";
			}
			else if(n >= 100){
				n = n - 100;
				roman = roman + "C";
			}
			else if(n >= 90 ){
				n = n - 90;
				roman = roman + "XC";
			}
			else if(n >= 50){
				n = n - 50;
				roman = roman + "L";
			}
			else if(n >= 40){
				n = n - 40;
				roman = roman + "XL";
			}
			else if(n>=10){
				n = n - 10;
				roman = roman + "X";
			}
			else if(n>=9){
				n = n - 9;
				roman = roman + "IX";
			}
			else if(n >= 5){
				n = n - 5;
				roman = roman + "V";
			}
			
			else if(n>=4){
				n = n - 4;
				roman = roman + "IV";
			}
			else if(n>=1){
				n = n - 1;
				roman = roman + "I";
			}
			else{
				
			}
			
	 	
		}
		
		System.out.println(roman);
 	}
}