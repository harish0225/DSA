/* 

 enum Status
{
    running, failed, pending ,sucess;//default it is a objects
}

public class enumeration {
    public static void main(String[] args) {
       /*  Status S=Status.running;
        System.out.println(S); */

        //to print all at time

   /*      Status[] S= Status.values();
        System.out.println(S[0]);//

        for ( Status sv : S)
        {
            System.out.println(sv  + ":" + sv.ordinal());
        }
    }
     */
//}


//enumeration in if else
/* enum Status
{
    running, failed, pending ,sucess;//default it is a objects
}

public class enumeration {
    public static void main(String[] args)
     {
    

         Status S= Status.running; */
          /* 
         if( S==Status.running)
         System.out.println("All good");

         else if( S==Status.failed)
         System.out.println("try again");

         else if( S==Status.pending)
         System.out.println("please wait");

         else
         System.out.println("done"); 
         */


        //switch

     /*    switch(S)
        {

        case running:
        System.out.println("All good");
        break;

        case failed:
        System.out.println("try again");
        break;

        case pending:
        System.out.println("please wait");
        break;

        default:
        System.out.println("done");
        break;
        
    }
}
} */


//program 3
enum laptop
{
    
    macbook(2000), xps(2400), surface(1500), thickpad(800);
    private int price;
    private laptop(int price)
    {
        this.price=500;
    }
    public int getprice()
    {
        return price;
    }
    public void setprice(int price)
    {
        this.price=price;
    }
}

public class enumeration {
    public static void main(String[] args)
     {
      /*   laptop lap=laptop.macbook;
        System.out.println(lap+ ":" + lap.getprice()); */
    
    for(laptop lap: laptop.values())
    {
        System.out.println(lap+ ":" +lap.getprice());
    }
    }
    }