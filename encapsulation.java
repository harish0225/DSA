/* class human
{
     int age;  //can ascess any one
     String name;


}
public class encapsulation 
{
    public static void main(String[] args) {
        
        human obj=new human();
        obj.age=11;
        obj.name="hari";
        System.out.println(obj.name);
    }
    

}
 */

  class human
{
      private int age;  //to acess only that class 
      private String name;

       public int getAge()
      {
        return age;
      }

      public void setAge(int a)
      {
        age=a;
      }

      public String getName()
      {
        return name;
      }
      public void setName(String n)
      {
        name=n;
      } 


}
public class encapsulation 
{
    public static void main(String[] args) {
        
        human obj=new human();
         /* obj.setAge=;
        obj.name="hari"; 
        System.out.println(obj.getName()+" " +obj.getAge()); */
        
       obj.setAge(30);
        obj.setName("hari");
        System.out.println(obj.getName()+" " +obj.getAge());   
     
    } 
    

}
 


 //this keyword
 /* class human
 {
       private int age;  //to acess only that class 
       private String name;
 
        public int getAge()
       {
         return age;
       }
 
       public void setAge(int age)//local variable
       {
         this.age=age;//this.age is instance var
       }
 
       public String getName()
       {
         return name;
       }
       public void setName(String name)
       {
         this.name=name; //in this java doesnt knows which is instance and local variable so value will be assign to local variable only
       }            //to solve this we use this keyword current object
 
 
 }
 public class encapsulation 
 {
     public static void main(String[] args) {
         
         human obj=new human();
         //obj.age=18;
         //obj.name="hari";
         //System.out.println(obj.getName()+" " +obj.getAge());
         
         obj.setAge(30);
         obj.setName("hari");
         System.out.println(obj.getName()+" " +obj.getAge());
     
     }
     
 
 }
  */