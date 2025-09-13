/* abstract class computer

    {
    public abstract void code();
    
}
 
 
 class laptop extends computer
{
    public void code()
    {

    System.out.println("code, compile,run");

}
} 


class desktop extends computer
{
    public void code()  
      {
        System.out.println("code, compile,run: faster"); 
    }
}

class developer
{
    public void devapp(computer desk)//passing object//here developer depends on computr not laptop or desktop
    {
     //lap.code();
     desk.code();
    }
}
public class Interfaces {
    public static void main(String[] args) {
        
      /*   laptop lap=new laptop();
        desktop desk=new desktop(); */

       // computer lap=new laptop();
        //computer desk=new desktop();
        //developer hari=new developer();
        //hari.devapp(lap);
    //}
     
//}
 
//interface
/* interface  computer

    {
    public void code();
    
}
 
 
 class laptop implements computer
{
    public void code()
    {

    System.out.println("code, compile,run");

}
} 


class desktop implements computer
{
    public void code()  
      {
        System.out.println("code, compile,run: faster"); 
    }
}

class developer
{
    public void devapp(computer desk)//passing object//here developer depends on computr not laptop or desktop
    {
     //lap.code();
     desk.code();
    }
}
public class Interfaces {
    public static void main(String[] args) {
        
      /*   laptop lap=new laptop();
        desktop desk=new desktop(); */

 /*        computer lap=new laptop();
        computer desk=new desktop();
        developer hari=new developer();
        hari.devapp(lap);
    }
     
} */

 

//interface2
interface A{
    int age=40;//final and static cant change 
    String area="banglore";
void show();
void config();
}

interface X
{
    void car();

}

interface Y extends X //means Y interfac alsa has void car();
{

}
//class B implements A,X
//class B implements A,Y
class B implements A,Y,X// all 3 are correct
{

    public void show()
    {
        System.out.println("in a show");
    }
    public void config()
    {
        System.out.println("in a config"); 
    }
    public void car()
    {
        System.out.println("in car");
    }
}

public class Interfaces
{
    public static void main(String[] args) {
        //B obj= new B();
       A obj;//acess for only A interface
      obj=new B();
        obj.show();
        obj.config();

        X obj1;
        obj1=new B();
        obj1.car();

        System.out.println(A.area);
        
    }
}
