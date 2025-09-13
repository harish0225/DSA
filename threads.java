

/* class A{
    public void show()
    {
        for(int i=0;i<5;i++)
        {
    System.out.println("hi");
        }
}
}
class B{
    public void show()
    {
    for(int i=0;i<20;i++)
    {
        System.out.println("hello");
    }
}
}
public class threads {
    public static void main(String[] args) {
        A obj1=new A();
        B obj2=new B();

        obj1.show();
        obj2.show();
    }

    
} */


//to change above output like hi hello we use threads
/* class A extends Thread
{
    public void run()
    {
        for(int i=0;i<20;i++)
        {
    System.out.println("hi");
            try {
                Thread.sleep(10);//waiting stage
            } catch (InterruptedException ex) {
            }
        }
}
}
class B extends Thread
{
    public void run()
    {
    for(int i=0;i<20;i++)
    {
        System.out.println("hello");
    }
}
}
public class threads {
    public static void main(String[] args) {
        A obj1=new A();
        B obj2=new B();

        System.err.println(obj1.getPriority());
        obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        try {
            Thread.sleep(2);
        }
         catch (InterruptedException ex ) {
        }
        obj2.start();
    }

    
} */

//prg3
/* class A implements Runnable
{
    public void run()
    {
        for(int i=0;i<20;i++)
        {
    System.out.println("hi");
            try {
                Thread.sleep(10);//waiting stage
            } catch (InterruptedException ex) {
            }
        }
}
}
class B  implements Runnable
{
    public void run()
    {
    for(int i=0;i<20;i++)
    {
        System.out.println("hello");
    }
}
}
public class threads {
    public static void main(String[] args) {
        Runnable obj1=new A();
        Runnable obj2=new B();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        

    
        t1.start();
        t2.start();
    }

    
} */

//in lamda
class A implements Runnable
{
    public void run()
    {
        for(int i=0;i<20;i++)
        {
    System.out.println("hi");
            try {
                Thread.sleep(10);//waiting stage
            } catch (InterruptedException ex) {
            }
        }
}
}
class B  implements Runnable
{
    public void run()
    {
    for(int i=0;i<20;i++)
    {
        System.out.println("hello");
    }
}
}
public class threads {
    public static void main(String[] args) {
        Runnable obj1=() ->
        {
            for(int i=0;i<20;i++)
            {
        System.out.println("hi");
                try {
                    Thread.sleep(10);//waiting stage
                } catch (InterruptedException ex) {
                }
            }
    };
        Runnable obj2=() ->
        {
            for(int i=0;i<20;i++)
            {
        System.out.println("hello");
                try {
                    Thread.sleep(10);//waiting stage
                } 
                catch (InterruptedException ex) {
                }
            }
    };

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        

    
        t1.start();
        t2.start();
    }

    
}