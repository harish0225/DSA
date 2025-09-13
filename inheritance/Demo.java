
public class Demo {
    public static void main(String[] args) {
    
        //AdvCalc obj = new AdvCalc();
        VeryadvCalc obj=new VeryadvCalc();
        int r1 = obj.add(5,9); 
        int r2 = obj.sub(4,5); 
        int r3 = obj.multi(2,5);
        int r4 = obj.div(3,2); 
        double r5=obj.power(4,7);

        System.out.println(r1 +":" +r2 +":" +r3 +":" +r4+ ":"+r5);
    }
}
