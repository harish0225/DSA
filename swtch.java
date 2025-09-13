public class swtch {
    
    public static void main(String[] args)
     {
    
        // int n=6;
        // if (n==1)
        // System.out.println("monday");
        // else if(n==2)
        // System.out.println("tuesday");
        // else if(n==3)
        // System.out.println("wednesday");
        // else if (n==4)
        // System.out.println("thursday");
        // else if(n==5)
        // System.out.println("friday");
        // else if(n==6)
        // System.out.println("saturday");
        // else
        // System.out.println("sunday");

       // to avoid above multiple if else we use switch
       int n=0;
       switch(n)
        {
            case 1:
                System.out.println("monday");
                break;   //break is used to end the execution if it not use 
                          //a break where the condition finds it starts executing everthing after a condition
            case 2:
                 System.out.println("tuesday");
                 break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                 System.out.println("thursday");
                 break;

           case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                 System.out.println("sunday");
                 break;

            default:
                System.out.println("enter a valid key");    
                break;
        }
    }
}
