class Student{
int x;
public void setData(){
System.out.println("Set Data executed");
}
public void setValue(int x){
this.x = x;
System.out.println("Set value executed and IV x: "+x);
}
public static void main(String []args){
Student s1 = new Student();
s1.setData();
s1.setValue(100);
}
}