class CheckChar{
public static void main(String[] args){

char ch = '@';

if(ch>='a' && ch <= 'z')
System.out.println(ch + " Lower case");
else if(ch>='A' && ch <= 'Z')
System.out.println(ch + " Upper case");
else
System.out.println(ch + " Not Uppercase not lowercase ");


}
}