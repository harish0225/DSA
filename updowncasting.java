class A{
    public void show1()
    {
        System.out.println("A in show");
    }
}

class B extends A
{
    public void show2()
    {
        System.out.println("B in show");
    }

}
public class updowncasting {

    public static void main(String[] args) {
        B obj=new B();
       //A obj= (A)new B();//upcasting
        obj.show1();
        //B obj1= (B) obj;//downcasting
        obj.show2();

    }
}