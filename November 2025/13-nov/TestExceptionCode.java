

  class Sample{
	 public int doIt(String str,Integer ...data)throws Exception
        {
                String sig="(String,Integer[])";
                System.out.println(str+" "+sig);
                return 1;
        }
         
}


 public class TestExceptionCode extends Sample
 {
        public int doIt(String str,Integer ...data)throws Exception
        {
                String sig="(String,Integer[])";
                System.out.println("overriden:"+str+" "+sig);
                return 0;
        }
        public static void main(String[] args) {
        TestExceptionCode s=new Sample();
        s.doIt("hello", 3);
        
}
 }
 
        

