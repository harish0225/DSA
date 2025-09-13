/* class A{
    public void show()
    {
        System.out.println("A in show");
    }
    public void config()
    {
        System.out.println("A config");
    }
}
class B extends A
{
    public void show()// this method override classs a void show
    {
        System.out.println("B in show");
    }
}
public class override
 {
    public static void main(String[] args) {
        
    
    B obj=new B();
    obj.show();
    obj.config();
}
 }
 */

 //program2
/* class Calc
{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
}
class AdvCalc extends Calc
{
    public int add(int n1,int n2)// method override
    {
        return n1+n2+1;
    }
}
public class override
 {
    public static void main(String[] args) {
        
    
        AdvCalc  obj=new  AdvCalc ();
     int r1 =obj.add(4,79);
     System.out.println(r1);
    
    
}
 } */