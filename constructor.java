/*  class human
{
      private int age;   
      private String name;

      public  human()  //default constructor
      {
        age=18;
        name="dhanush";
      }
      public human(int a, String n)
      {
       age=a;
        name=n;
                                                                                 
      }

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
public class constructor 
{
    public static void main(String[] args) {
        
        human obj=new human();  //default
        human obj1=new human(25,"sai"); //parameterized
        //obj.age=18;
        //obj.name="hari";
        System.out.println(obj.getName()+" " +obj.getAge());
        System.out.println(obj1.getName()+" " +obj1.getAge());
         //obj.setAge(30);
       // obj.setName("hari");
        //System.out.println(obj.getName()+" " +obj.getAge());
     
    }
    

}  */



// Human.java
 class Human {
    private int age;
    private String name;

    // Default constructor
    public Human() {
        this.age = 18;
        this.name = "dhanush";
    }

    // Parameterized constructor (THIS WAS LIKELY MISSING OR NOT COMPILED)
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// constructor.java
public class constructor {
    public static void main(String[] args) {
        // Using the default constructor
        Human obj1 = new Human();
        System.out.println("Object 1: Name=" + obj1.getName() + ", Age=" + obj1.getAge());

        // Using the parameterized constructor (THIS CAUSED THE ERROR)
        Human obj2 = new Human(25, "sai");
        System.out.println("Object 2: Name=" + obj2.getName() + ", Age=" + obj2.getAge());
    }
} 