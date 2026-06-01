
class Swaping{
	public static void main(String []args){
	
	
		String name1 = "Vivek";
		String name2 = "Dhule";
		
		
		 name1 = name1 + name2;                        // VivekDhule
        name2 = name1.replace(name2, "");             // remove "Dhule" Vivek
        name1 = name1.replace(name2, "");             // remove "Vivek" Dhule

		
		System.out.println(name1 + " " + name2);
	}
}
		 