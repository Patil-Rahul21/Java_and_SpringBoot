class Mobile {
    String Brand;
    int Price;
    static String Name;

    static 
    {
        Name = "Rahul";
        System.out.println("In Static Block");
    }

public Mobile(){
    Brand = "";
    Price = 2000;
    System.out.println("In Constructor");
}

public void show()
{
    System.out.println(Brand + ":" + Price + ":" + Name);
}

}

public class StaticBlock {
    public static void main(String[] args)
    {
        Class.forName(className:"Mobile");


        // Mobile obj = new Mobile();
        // obj.Brand = "Apple";
        // obj.Price = 129999;
        // obj.Name = "Tab";

        // Mobile obj2 = new Mobile();
    }

}