class Student{
    int marks;
    static int count;
    public void marks(int marks)
    {
        this.marks = marks;
        count++;
    }
	
    public void pass()
    {
        if(marks>=40)
        {
            System.out.println("Student"+count +"=Pass");
        }
        else
        {
            System.out.println("Student"+count +"=Fail");
        }
    }
	
    public static void main(String[]args)
    {
        Student s1 = new Student();
        s1.marks(45);
        s1.pass();

		Student s2 = new Student();
        s2.marks(30);
        s2.pass();

        Student s3 = new Student();
        s3.marks(70);
        s3.pass();


    }

}