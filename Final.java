/* public class Final {
    public static void main(String[] args) {
        
         final int num=8;
        //num=9;// if i use final value doesnt change to 9
        System.out.println(num);
    }
    
} */

//prg2 for class
/*   final class Calc
{
    public void show()
    {
        System.out.println("in calc show");
    }
    public void add(int n1 , int n2)
    {
    System.out.println(n1+n2);
    //return n1+n2;
    }
}

class AdvCalc extends Calc//shows error because final keyword used so it cant ascess by any of a class and it stops inheritance
{

}
public class Final {

    public static void main(String[] args) {
        Calc obj=new Calc();
        obj.show();
        obj.add(3,8);
    }
}  */



 final class Calc
{
    public final  void show()//here final keyword stops overriding
    {
        System.out.println("in calc show");
    }
    public void add(int n1 , int n2)
    {
    System.out.println(n1+n2);
    //return n1+n2;
    }
}

class AdvCalc extends Calc
{
    public void show()
    {
        System.out.println("in Advcalc show");
    }

}
public class Final {

    public static void main(String[] args) {
        Calc obj=new Calc();
        obj.show();
        obj.add(3,8);
    }
}
 