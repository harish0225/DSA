/*  class Mobile{
    String Brand;//local variable
    int price;
    static String name="";//static variable
public void show()
{
    System.out.println(Brand+" :  " +price+" : " +name);
}
}
public class Static {
    
    public static void main(String[] args) {
        Mobile obj1=new Mobile();
        //obj1.Brand="vivo";
        obj1.price=10000;
        //obj1.name="pro100";
       // Mobile.name="pro100";

        Mobile obj2=new Mobile();
        obj2.Brand="apple";
        obj2.price=20000;
       // Mobile.name="max100";

       obj1.name="iphone";


        //System.out.println(obj1.Brand);
        obj1.show();
        obj2.show();
        //System.out.println(obj1.Brand+" :  " +obj1.price+" : " +obj1.name);
        //System.out.println(obj2.Brand+" :  " +obj2.price+" : " +obj2.name);
        
    }
} */
 

 //static block
  class Mobile{
    String Brand;//instance variable
    int price;
    static String name;//static variable

     static{
        name="Phone";
        System.out.println("in static");
    } 
    public Mobile()// constructor method to make a default value
    {
        Brand="";
        price=200;
        System.out.println("in constructor");

    }
public void show()//it is a instance method not static method
{
    System.out.println(Brand+" :  " +price+" : " +name);
}


/* public static void show1(Mobile obj)// static method in this non static should not been used
{                                    //if we have a object reference like mobile obj than we can use 
 System.out.println("in static method"); 
 System.out.println(obj.Brand+":" +obj.price+":"+name);
} */
}
public class Static {
    
    public static void main(String[] args)
     {
       // Class.forName("Mobile"); //to load amobile class
        try {
    Class.forName("Mobil");
} catch (ClassNotFoundException e) {
   System.out.println("class not found");
}

        Mobile obj1=new Mobile();
        obj1.Brand="vivo";
        obj1.price=10000;
        //obj1.name="pro100";
        Mobile.name="pro100";

        Mobile obj2=new Mobile(); 
         obj2.Brand="apple";
        obj2.price=20000;
        Mobile.name="max100"; 

       //obj1.name="iphone";


        //System.out.println(obj1.Brand);
        obj1.show();
        obj2.show(); 
        //Mobile.show1(obj1);
        
    }
} 
