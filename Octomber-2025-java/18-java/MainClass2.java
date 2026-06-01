interface I1{
void m1();
}
class A implements I1{
@Override
public void m1(){
System.out.println("method completed in interface");
}
}
class MainClass2
{
public static void main(String []args){
A a1 = new A();
a1.m1();
}
}