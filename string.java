/* public class string  {//string is a class
  public static void main(String[] args) {
    //String name="Harish";
      String name=new String("Harish");
      System.out.println("Hello " +name);
      System.out.println(name.charAt(0));
      System.out.println(name.concat(" gagana")); 
      name="love";
      System.out.println(name.contentEquals(name) + "love");
  }  
    
} */
 
public class string
{
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        //System.out.println(sb.capacity());  to check buffer space
        System.out.println(sb);
        sb.append("gagana");
        System.out.println(sb);
        System.out.println(sb);
        sb.deleteCharAt(2);
        System.out.println(sb);
       sb.insert(1,"friends");
        System.out.println(sb);
        sb.setLength(30);
        System.out.println(sb); 
    }
} 

