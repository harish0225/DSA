 abstract class car//abstract classs
{
   // public void drive();//shows error
    
    public abstract void drive();
    public  void playmusic()
    {
        System.out.println("in music");
    }
}

class bmw extends car//concrete class
{
    public void drive()
    {
        System.out.println("in drive");
    }
    public void sit()
    {
        System.out.println("hi");
    }
}


public class Abstract {
    public static void main(String[] args) {
    car obj=new bmw();
     //bmw obj1=new bmw();

        obj.playmusic();
        obj.drive();
       ((bmw)obj).sit();
        
    }
    
}
