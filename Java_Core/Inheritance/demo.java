

public class demo 
{
    public static void main(String[] args) 
    {
        Adv2Calc obj = new Adv2Calc();
        int rsl1 = obj.add(3, 4);
        int rsl2 = obj.sub(9, 4);
        int rsl3 = obj.mul(4, 3);
        int rsl4 = obj.div(4, 2);
        double rsl5 = obj.power(4, 3);
        System.out.println(rsl1 + ":" + rsl2 + ":" + rsl3 + ":" + rsl4 + ":" + ":" + rsl5);
    }

    
}