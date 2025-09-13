/* 
class calculator{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }

}
public class object {
    public static void main(String[] args) {
        int num1=8;
        int num2=9;
        calculator calc=new calculator();
        int result =calc.add(num1, num2);
        System.out.println(result);

    }
    
}
 */


//program 
/* class computer
{
    public void addmusic()
    {
        System.out.println("music playing");
    }
    public String getmepen(int cost)
    {
        if(cost>=10)
        return "pen";
        else
        return "nothing";
}
}
public class object
{
    public static void main(String[] args) {
        computer c=new computer();
        c.addmusic();
        String str=c.getmepen(5);
       System.out.println(str);
    }
} */




// program3 static and local variables
class calculator
{
    int num=5;
    public int add(int n1, int n2)
    {
        //System.out.println(num);
        return n1+n2;
    }

}
public class object {
    public static void main(String[] args)
     {
        int data=10;
        calculator obj=new calculator();
        calculator obj1=new calculator();
        int result =obj.add(5,6);
       // System.out.println(result);
       obj.num=8;
       System.out.println(obj.num);
       System.out.println(obj1.num);
    }
    }
    