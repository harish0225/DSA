class A{
    public void show()
    {
        System.out.println("in A show");
    }
}
 class B extends A
{
     public void show()
    {
        System.out.println("in B show");
    } 

} 

class C extends A  //if i not use extends it will not work
{
     public void show()
    {
        System.out.println("in C show");
    } 

} 
public class Dynamicmd {
    public static void main(String[] args) {
       
       // B obj=new B();
        C obj=new C();//its work because obt type is A and implementation is B 
        obj.show();     //reference of superclass and object of subclass
    
        obj=new B();
        obj.show();

        obj=new C();
        obj.show();
    }
    
}
