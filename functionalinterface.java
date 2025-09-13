/* @FunctionalInterface
interface A{
    //void show();
    void show(int i);
}
public class functionalinterface {
    public static void main(String[] args) {
      /*   A obj=new A() 
        {
            public void show()
            {
                System.out.println("x in show");
            }
            
        };
        obj.show(); */

        //or
 /*        A obj= (i)-> //lamda expression

        {
        
                System.out.println("x in show" + i);
                
        };
        obj.show(6);
        
    }
} */ 


//prg 2
interface A{
    //void show();
    int add(int a, int b);
}
public class functionalinterface {
    public static void main(String[] args) {
      /*   A obj=new A()
        {
            public int add(int a, int b)
            {
                return a+b;
            }
        }; */

        //or 
        A obj=(a,b)->a+b;
       /*  A obj=(int a ,int b)->
        {
                return a+b;

        }; */
        int result=obj.add(5,7);
        System.out.println(result);

    }
}