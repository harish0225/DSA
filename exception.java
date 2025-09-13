

 public class exception 
{
    public static void main(String[] args) {
    
 int i=0;
 int j=0;

 try {
         j= 18/i;
 }

 catch(Exception e) //this catch block will execute only if itis exception
 {
    //System.out.println("something went wrong");
    System.out.println("something went wrong" + e);
 }
 //System.out.println(j);
 //System.out.println("bye");
 

}
} 


//prg2
/* public class exception 
{
    public static void main(String[] args) {
    
 int i=2;
 int j=0;
 int nums[]=new int[5];
 String str=null;

 try {
         j= 18/i;
         System.out.println(nums[1]);
         System.out.println(nums[3]);
         System.out.println(str.length());
 }
 catch(ArithmeticException e)
 {
    System.out.println("cannot divide by zero");
 }

 catch(ArrayIndexOutOfBoundsException e)
 {
    System.out.println("stay in your limut");
 }

 catch(Exception e) //this catch block will execute only if itis exception
 {
    System.out.println("something went wrong" + e);
 }
 System.out.println(j);
 System.out.println("bye");
 

}
} */

//prg3
/* public class exception 
{
    public static void main(String[] args) {
    
 int i=20;
 int j=0;


 try {
         j= 18/i;
         if(j==0)
            throw new ArithmeticException("i dont want to print message");
 }
 catch(ArithmeticException e)
 {      
    j=18/1;
    System.out.println("thats the default output" +e);
 }

 catch(Exception e) //this catch block will execute only if itis exception
 {
    System.out.println("something went wrong" + e);
 }
 System.out.println(j);
 System.out.println("bye");
 

}
} */

//throws
/* 
class A{
    public void show() throws ClassNotFoundException
     {
        class.forName(className:"calc");
    }

}
public class exception 
{
    static {
        System.out.println("class laoded");
    }
    public static void main(String[] args)
     {
        A obj=new A();
        try {
            obj.show();
        }
        catch(Class NotFoundException e)
        {
            e.printStackTrace();
        }
    }
         */

