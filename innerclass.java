/* class A
{
    int age;
    public void show()
    {
        System.out.println("A in show");
    }
    static class B
    {
        public void config()
        {
            System.out.println("in configu");
        }
    }
}
public class innerclass 
{
 public static void main(String[] args) {
     A obj=new A();
     obj.show();

     //A.B obj1=obj.new B();//non static
     A.B obj1=new A.B();//inner class is static

     obj1.config();
 }   
}
 */

 //anonomous class
/*  class A 
 {
    public void show()
    {
        System.out.println("in A show");
    }
 }

 public class innerclass{

public static void main(String[] args) {

    A obj=new A()
    {
        public void show()
        {
            System.out.println("in new show");
        }
    };
    obj.show();
}

 } */

 //abstract and anonomus innerclass

 abstract class A 
 {
    public abstract void show();
    public abstract void config();
    
 }
/*  class B extends A
 {
    public void show()  //this commented can be skip and used directly in anonomous innerclass
    {
        System.out.println("in B show");
    }
 } */

 public class innerclass{

public static void main(String[] args) {

    A obj=new A()
     {
        public void show()
        {
            System.out.println("in new show");
        }

        public void config()
        {
            System.out.println("in new config");
        }
    }; 
    obj.show();
    obj.config();
}

 }