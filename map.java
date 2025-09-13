
 import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<String,Integer> students=new HashMap<>();
        students.put("navin",56);
        students.put("harish",23);
        students.put("gagi",36);
        students.put("dhanu",76);
        students.put("basva",59);
       // System.out.println(students);
        //System.out.println(students.get("harish"));
        //to display
        System.out.println(students.keySet());
        for(String key:students.keySet())
        {
        System.out.println( key +":" +students.get(key));
        }
    }
    
}  

//prg2 to sort collection sortying based on values

/* import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class map {
    public static void main(String[] args) {
        Comparator<Integer> com=new Comparator<Integer>()//to sort based on last digit
        {
            public int compare(Integer i,Integer j)
            {
                if(i%10>j%10)
                return i;
                else
                return -1;
            }
        };
        List<Integer> nums=new ArrayList<>();
       nums.add(38);
       nums.add(62);
       nums.add(39);
       nums.add(45);
       nums.add(3);
       nums.add(2);
      
    //  Collections.sort(nums);

    Collections.sort(nums,com);

      System.out.println(nums);
    }
    
} 
 */

 //prg print even no and multiply 

/* import java.util.Arrays;
import java.util.List;


public class map {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(1,4,6,7,9); //to sort based on last digit
        //prit array
        for(int i=0; i<nums.size();i++)
        {
            System.out.println(nums.get(i));
        }
        //or
        for(int n:nums){
            System.out.println(nums);

        }
        //or
        nums.forEach(n-> System.out.println(n)); */
        

        /* int sum=0;
        for(int n:nums)
        {
        if(n%2==0)
              {
                n=n*2;
                sum=sum+n;
              }   
            } */
            //System.out.println(sum);
  //      }
//}

//foeach
/* import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class map {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(1,4,6,7,9);
      /*   Consumer<Integer> con= new Consumer<Integer>()
        {
        public void accept(Integer n)
        {
            System.out.println(n);
        } */
    //IN LAMDA
   /*  Consumer<Integer> con= (Integer n)->//or nums.forEach(n-> System.out.println(n));
    {
        
        {
            System.out.println(n);
        }
    };
    nums.forEach(con);
    }
} */