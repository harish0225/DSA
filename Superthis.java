class A
{
    public A()
     
        {
            super();   //in constructot super will have default if it not mention also
           
            System.out.println("in A");
        }
        public A(int n)
        {
            //super();
            this();
            System.out.println("in A int");
                
            }
        }
    

class B extends A
{
    public B()
    {
        //this();
        //super();
        System.out.println("in B");
    }
    public B(int n)
    {   
        //this();
        super();
        System.out.println("in B int");
    }    
    }


public class Superthis
 {
    public static void main(String[] args) {
        
        A obj=new B(2);
    }
}
