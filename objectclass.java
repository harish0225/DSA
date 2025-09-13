class laptop
{
    String model;
    int price;

    public String toString()
    {
        //return"hari";
        return model + ":" +price;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        laptop other = (laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
}

public class objectclass {
    public static void main(String[] args) {
        
      /*   laptop obj=new laptop();
        obj.model="lenovo";
        obj.price=1000;
        System.out.println(obj); */
        laptop obj1=new laptop();
        obj1.model="lenovo";
        obj1.price=1000;

        laptop obj2=new laptop();
        obj2.model="lenovo";
        obj2.price=1000;
        //boolean result=obj1==obj2; //it showing false whic is incorrect output
        boolean result=obj1.equals(obj2);
        System.out.println(result);

    }
    
}
