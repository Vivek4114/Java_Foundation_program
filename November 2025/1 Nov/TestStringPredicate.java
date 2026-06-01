/* Write a program enter a string or enter a sentence and check whether it contain java or not */

import java.util.function.Predicate;
import java.util.Scanner;
class TestStringPredicate{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentece to check whether it contains java : " );
		String str = sc.nextLine();
		
		Predicate <String> s = (sentence) -> sentence.contains("java");
		
		System.out.println(" Java is Present ." + s.test(str));
	}
}
		