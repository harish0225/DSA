//public class array 
//{
//public static void main(String[] args)
 //{
   
    //int nums[]={3,7,2,4};
    //nums[1]=10;
    //System.out.println(nums[1]);
  /*   int nums[] =new int[4];
    nums[0]=4;
    nums[1]=2;
    nums[2]=8;
    nums[3]=7;
    for(int i=0;i<=3;i++)

    System.out.println(nums[i]);
    }
    
} */

//multideminsional array
/* public static void main(String[] args) {
    //int nums[][]=new int[3][4];//normal array
    int nums[][]=new int[3][];//jagged array
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<4;j++)
        {
            nums[i][j]=(int) (Math.random()*100);
        }
    }
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<4;j++)
        {
            System.out.print(nums[i][j] + "  ");
        }
            System.out.println();
    }
}
} */
//code for diiferent dimension
/* public static void main(String[] args) {
    //int nums[][]=new int[3][4];//normal array
    int nums[][]=new int[3][];//jagged array
    nums[0]=new int[4];
    nums[1]=new int[3];
    nums[2]=new int[2];
    for(int i=0;i<nums.length;i++)
    {
        for(int j=0;j<nums[i].length;j++)
        {
            nums[i][j]=(int) (Math.random()*100);
        }
    }
    for(int i=0;i<nums.length;i++)
    {
        for(int j=0;j<nums[i].length;j++)
        {
            System.out.print(nums[i][j] + "  ");
        }
            System.out.println();
    }
}
} */


//program3
class student
{
    int rollno;
    String name;
    int marks;
}
public class array{
    public static void main(String[] args) {
        
    student s1=new student();
    s1.rollno=1;
    s1.name="harish";
    s1.marks=34;
    
    student s2=new student();
    s2.rollno=2;
    s2.name="rish";
    s2.marks=44;
    
    student s3=new student();
    s3.rollno=3;
    s3.name="gagana";
    s3.marks=94;
    System.out.println(s3.rollno);
    student students[]=new student[3]; //it is a array which can hold 3 students details
    students[0]=s1;
    students[1]=s2;
    students[2]=s3; 
    
    for(int i=0;i<students.length;i++)
   //for(student stud: students)
    {
        System.out.println(students[i].name +" : " + students[i].marks);
       // System.out.println(stud.name+":"+stud.marks);
    } 
    }
}
