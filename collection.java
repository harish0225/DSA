  import java.util.Collection;
import java.util.ArrayList;


public class collection {
    public static void main(String[] args) {
        
    //Collection nums=  new ArrayList();
    Collection<Integer> nums=  new ArrayList<Integer>();
    nums.add(6);//thes are objects if we not mentio integer in syntax
    nums.add(5);
    nums.add(4);
    nums.add(8);
    nums.add(0);
    nums.add(1);

        for (int n:nums)
    System.out.println(nums);//in collection we can print directly but in array we use for loop to print

    }
} 

//list
/*  import java.util.ArrayList;
import java.util.List;


public class collection {
    public static void main(String[] args) {
        
    //Collection nums=  new ArrayList();
    List<Integer> nums=  new ArrayList<Integer>();
    nums.add(6);//thes are objects if we not mentio integer in syntax
    nums.add(5);
    nums.add(4);
    nums.add(8);
    nums.add(0);
    nums.add(1);
    nums.add(6);

    System.out.println(nums.get(2));//wet get etc
    System.out.println(nums.indexOf(5));
        System.out.println(nums);
        
    }
}  */

//set also same
/*  import java.util.ArrayList;
import java.util.List;


public class collection {
    public static void main(String[] args) {
        
    //Collection nums=  new ArrayList();
    List<Integer> nums=  new ArrayList<Integer>();
    nums.add(6);//thes are objects if we not mentio integer in syntax
    nums.add(5);
    nums.add(4);
    nums.add(8);
    nums.add(0);
    nums.add(1);
    nums.add(6);
    System.out.println(nums);

   for(int n:nums)
   {
    System.out.println(n);
   }

        
    }
} */
 
/* import java.util.Iterator;
 import java.util.Set;
import java.util.TreeSet;


public class collection {
    public static void main(String[] args) {
        
    //Collection nums=  new ArrayList();
    
    //Set<Integer> nums=  new HashSet<Integer>();//it will not give value in sorted no insex values
     Set<Integer> nums=  new TreeSet<Integer>();// gives in sorted values
     nums.add(6);//thes are objects if we not mentio integer in syntax
    nums.add(5);
    nums.add(44);
    nums.add(28);
    nums.add(67);
    nums.add(15);
    nums.add(65);
    //System.out.println(nums);
        
   Iterator<Integer> values=nums.iterator();//instead of for loop used iterator
   while(values.hasNext())
   System.out.println(values.next());//it print only 1 element so use loop

    }
} */